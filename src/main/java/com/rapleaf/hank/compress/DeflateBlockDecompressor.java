/**
 *  Copyright 2013 LiveRamp
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rapleaf.hank.compress;

import com.rapleaf.hank.util.IOStreamUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class DeflateBlockDecompressor implements BlockDecompressor {

  private final Inflater inflater = new Inflater();
  private final byte[] copyBuffer = new byte[IOStreamUtils.DEFAULT_BUFFER_SIZE];

  @Override
  public void decompress(byte[] buffer, int offset, int length, OutputStream outputStream) throws IOException {
    inflater.reset();
    inflater.setInput(buffer, offset, length);
    while (true) {
      int numBytes;
      try {
        numBytes = inflater.inflate(copyBuffer);
      } catch (DataFormatException e) {
        throw new IOException(e);
      }
      if (numBytes != 0) {
        outputStream.write(copyBuffer, 0, numBytes);
      } else {
        if (inflater.finished()) {
          break;
        } else {
          throw new IllegalStateException("Inflater did not inflate any bytes and is not finished.");
        }
      }
    }
  }
}
