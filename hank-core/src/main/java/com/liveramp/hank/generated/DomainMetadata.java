/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.liveramp.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainMetadata implements org.apache.thrift.TBase<DomainMetadata, DomainMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<DomainMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainMetadata");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_partitions", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STORAGE_ENGINE_FACTORY_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("storage_engine_factory_class", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STORAGE_ENGINE_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("storage_engine_options", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITIONER_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitioner_class", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField REQUIRED_HOST_FLAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("required_host_flags", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField NEXT_VERSION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("next_version_number", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainMetadataTupleSchemeFactory());
  }

  public int id; // required
  public int num_partitions; // required
  public String storage_engine_factory_class; // required
  public String storage_engine_options; // required
  public String partitioner_class; // required
  public String required_host_flags; // required
  public int next_version_number; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NUM_PARTITIONS((short)2, "num_partitions"),
    STORAGE_ENGINE_FACTORY_CLASS((short)3, "storage_engine_factory_class"),
    STORAGE_ENGINE_OPTIONS((short)4, "storage_engine_options"),
    PARTITIONER_CLASS((short)5, "partitioner_class"),
    REQUIRED_HOST_FLAGS((short)6, "required_host_flags"),
    NEXT_VERSION_NUMBER((short)7, "next_version_number");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NUM_PARTITIONS
          return NUM_PARTITIONS;
        case 3: // STORAGE_ENGINE_FACTORY_CLASS
          return STORAGE_ENGINE_FACTORY_CLASS;
        case 4: // STORAGE_ENGINE_OPTIONS
          return STORAGE_ENGINE_OPTIONS;
        case 5: // PARTITIONER_CLASS
          return PARTITIONER_CLASS;
        case 6: // REQUIRED_HOST_FLAGS
          return REQUIRED_HOST_FLAGS;
        case 7: // NEXT_VERSION_NUMBER
          return NEXT_VERSION_NUMBER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __NUM_PARTITIONS_ISSET_ID = 1;
  private static final int __NEXT_VERSION_NUMBER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("num_partitions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STORAGE_ENGINE_FACTORY_CLASS, new org.apache.thrift.meta_data.FieldMetaData("storage_engine_factory_class", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STORAGE_ENGINE_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("storage_engine_options", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONER_CLASS, new org.apache.thrift.meta_data.FieldMetaData("partitioner_class", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUIRED_HOST_FLAGS, new org.apache.thrift.meta_data.FieldMetaData("required_host_flags", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEXT_VERSION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("next_version_number", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainMetadata.class, metaDataMap);
  }

  public DomainMetadata() {
  }

  public DomainMetadata(
    int id,
    int num_partitions,
    String storage_engine_factory_class,
    String storage_engine_options,
    String partitioner_class,
    String required_host_flags,
    int next_version_number)
  {
    this();
    this.id = id;
    set_id_isSet(true);
    this.num_partitions = num_partitions;
    set_num_partitions_isSet(true);
    this.storage_engine_factory_class = storage_engine_factory_class;
    this.storage_engine_options = storage_engine_options;
    this.partitioner_class = partitioner_class;
    this.required_host_flags = required_host_flags;
    this.next_version_number = next_version_number;
    set_next_version_number_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainMetadata(DomainMetadata other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.num_partitions = other.num_partitions;
    if (other.is_set_storage_engine_factory_class()) {
      this.storage_engine_factory_class = other.storage_engine_factory_class;
    }
    if (other.is_set_storage_engine_options()) {
      this.storage_engine_options = other.storage_engine_options;
    }
    if (other.is_set_partitioner_class()) {
      this.partitioner_class = other.partitioner_class;
    }
    if (other.is_set_required_host_flags()) {
      this.required_host_flags = other.required_host_flags;
    }
    this.next_version_number = other.next_version_number;
  }

  public DomainMetadata deepCopy() {
    return new DomainMetadata(this);
  }

  @Override
  public void clear() {
    set_id_isSet(false);
    this.id = 0;
    set_num_partitions_isSet(false);
    this.num_partitions = 0;
    this.storage_engine_factory_class = null;
    this.storage_engine_options = null;
    this.partitioner_class = null;
    this.required_host_flags = null;
    set_next_version_number_isSet(false);
    this.next_version_number = 0;
  }

  public int get_id() {
    return this.id;
  }

  public DomainMetadata set_id(int id) {
    this.id = id;
    set_id_isSet(true);
    return this;
  }

  public void unset_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean is_set_id() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void set_id_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int get_num_partitions() {
    return this.num_partitions;
  }

  public DomainMetadata set_num_partitions(int num_partitions) {
    this.num_partitions = num_partitions;
    set_num_partitions_isSet(true);
    return this;
  }

  public void unset_num_partitions() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_PARTITIONS_ISSET_ID);
  }

  /** Returns true if field num_partitions is set (has been assigned a value) and false otherwise */
  public boolean is_set_num_partitions() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_PARTITIONS_ISSET_ID);
  }

  public void set_num_partitions_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_PARTITIONS_ISSET_ID, value);
  }

  public String get_storage_engine_factory_class() {
    return this.storage_engine_factory_class;
  }

  public DomainMetadata set_storage_engine_factory_class(String storage_engine_factory_class) {
    this.storage_engine_factory_class = storage_engine_factory_class;
    return this;
  }

  public void unset_storage_engine_factory_class() {
    this.storage_engine_factory_class = null;
  }

  /** Returns true if field storage_engine_factory_class is set (has been assigned a value) and false otherwise */
  public boolean is_set_storage_engine_factory_class() {
    return this.storage_engine_factory_class != null;
  }

  public void set_storage_engine_factory_class_isSet(boolean value) {
    if (!value) {
      this.storage_engine_factory_class = null;
    }
  }

  public String get_storage_engine_options() {
    return this.storage_engine_options;
  }

  public DomainMetadata set_storage_engine_options(String storage_engine_options) {
    this.storage_engine_options = storage_engine_options;
    return this;
  }

  public void unset_storage_engine_options() {
    this.storage_engine_options = null;
  }

  /** Returns true if field storage_engine_options is set (has been assigned a value) and false otherwise */
  public boolean is_set_storage_engine_options() {
    return this.storage_engine_options != null;
  }

  public void set_storage_engine_options_isSet(boolean value) {
    if (!value) {
      this.storage_engine_options = null;
    }
  }

  public String get_partitioner_class() {
    return this.partitioner_class;
  }

  public DomainMetadata set_partitioner_class(String partitioner_class) {
    this.partitioner_class = partitioner_class;
    return this;
  }

  public void unset_partitioner_class() {
    this.partitioner_class = null;
  }

  /** Returns true if field partitioner_class is set (has been assigned a value) and false otherwise */
  public boolean is_set_partitioner_class() {
    return this.partitioner_class != null;
  }

  public void set_partitioner_class_isSet(boolean value) {
    if (!value) {
      this.partitioner_class = null;
    }
  }

  public String get_required_host_flags() {
    return this.required_host_flags;
  }

  public DomainMetadata set_required_host_flags(String required_host_flags) {
    this.required_host_flags = required_host_flags;
    return this;
  }

  public void unset_required_host_flags() {
    this.required_host_flags = null;
  }

  /** Returns true if field required_host_flags is set (has been assigned a value) and false otherwise */
  public boolean is_set_required_host_flags() {
    return this.required_host_flags != null;
  }

  public void set_required_host_flags_isSet(boolean value) {
    if (!value) {
      this.required_host_flags = null;
    }
  }

  public int get_next_version_number() {
    return this.next_version_number;
  }

  public DomainMetadata set_next_version_number(int next_version_number) {
    this.next_version_number = next_version_number;
    set_next_version_number_isSet(true);
    return this;
  }

  public void unset_next_version_number() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEXT_VERSION_NUMBER_ISSET_ID);
  }

  /** Returns true if field next_version_number is set (has been assigned a value) and false otherwise */
  public boolean is_set_next_version_number() {
    return EncodingUtils.testBit(__isset_bitfield, __NEXT_VERSION_NUMBER_ISSET_ID);
  }

  public void set_next_version_number_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEXT_VERSION_NUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unset_id();
      } else {
        set_id((Integer)value);
      }
      break;

    case NUM_PARTITIONS:
      if (value == null) {
        unset_num_partitions();
      } else {
        set_num_partitions((Integer)value);
      }
      break;

    case STORAGE_ENGINE_FACTORY_CLASS:
      if (value == null) {
        unset_storage_engine_factory_class();
      } else {
        set_storage_engine_factory_class((String)value);
      }
      break;

    case STORAGE_ENGINE_OPTIONS:
      if (value == null) {
        unset_storage_engine_options();
      } else {
        set_storage_engine_options((String)value);
      }
      break;

    case PARTITIONER_CLASS:
      if (value == null) {
        unset_partitioner_class();
      } else {
        set_partitioner_class((String)value);
      }
      break;

    case REQUIRED_HOST_FLAGS:
      if (value == null) {
        unset_required_host_flags();
      } else {
        set_required_host_flags((String)value);
      }
      break;

    case NEXT_VERSION_NUMBER:
      if (value == null) {
        unset_next_version_number();
      } else {
        set_next_version_number((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(get_id());

    case NUM_PARTITIONS:
      return Integer.valueOf(get_num_partitions());

    case STORAGE_ENGINE_FACTORY_CLASS:
      return get_storage_engine_factory_class();

    case STORAGE_ENGINE_OPTIONS:
      return get_storage_engine_options();

    case PARTITIONER_CLASS:
      return get_partitioner_class();

    case REQUIRED_HOST_FLAGS:
      return get_required_host_flags();

    case NEXT_VERSION_NUMBER:
      return Integer.valueOf(get_next_version_number());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return is_set_id();
    case NUM_PARTITIONS:
      return is_set_num_partitions();
    case STORAGE_ENGINE_FACTORY_CLASS:
      return is_set_storage_engine_factory_class();
    case STORAGE_ENGINE_OPTIONS:
      return is_set_storage_engine_options();
    case PARTITIONER_CLASS:
      return is_set_partitioner_class();
    case REQUIRED_HOST_FLAGS:
      return is_set_required_host_flags();
    case NEXT_VERSION_NUMBER:
      return is_set_next_version_number();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainMetadata)
      return this.equals((DomainMetadata)that);
    return false;
  }

  public boolean equals(DomainMetadata that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_num_partitions = true;
    boolean that_present_num_partitions = true;
    if (this_present_num_partitions || that_present_num_partitions) {
      if (!(this_present_num_partitions && that_present_num_partitions))
        return false;
      if (this.num_partitions != that.num_partitions)
        return false;
    }

    boolean this_present_storage_engine_factory_class = true && this.is_set_storage_engine_factory_class();
    boolean that_present_storage_engine_factory_class = true && that.is_set_storage_engine_factory_class();
    if (this_present_storage_engine_factory_class || that_present_storage_engine_factory_class) {
      if (!(this_present_storage_engine_factory_class && that_present_storage_engine_factory_class))
        return false;
      if (!this.storage_engine_factory_class.equals(that.storage_engine_factory_class))
        return false;
    }

    boolean this_present_storage_engine_options = true && this.is_set_storage_engine_options();
    boolean that_present_storage_engine_options = true && that.is_set_storage_engine_options();
    if (this_present_storage_engine_options || that_present_storage_engine_options) {
      if (!(this_present_storage_engine_options && that_present_storage_engine_options))
        return false;
      if (!this.storage_engine_options.equals(that.storage_engine_options))
        return false;
    }

    boolean this_present_partitioner_class = true && this.is_set_partitioner_class();
    boolean that_present_partitioner_class = true && that.is_set_partitioner_class();
    if (this_present_partitioner_class || that_present_partitioner_class) {
      if (!(this_present_partitioner_class && that_present_partitioner_class))
        return false;
      if (!this.partitioner_class.equals(that.partitioner_class))
        return false;
    }

    boolean this_present_required_host_flags = true && this.is_set_required_host_flags();
    boolean that_present_required_host_flags = true && that.is_set_required_host_flags();
    if (this_present_required_host_flags || that_present_required_host_flags) {
      if (!(this_present_required_host_flags && that_present_required_host_flags))
        return false;
      if (!this.required_host_flags.equals(that.required_host_flags))
        return false;
    }

    boolean this_present_next_version_number = true;
    boolean that_present_next_version_number = true;
    if (this_present_next_version_number || that_present_next_version_number) {
      if (!(this_present_next_version_number && that_present_next_version_number))
        return false;
      if (this.next_version_number != that.next_version_number)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_id = true;
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_num_partitions = true;
    builder.append(present_num_partitions);
    if (present_num_partitions)
      builder.append(num_partitions);

    boolean present_storage_engine_factory_class = true && (is_set_storage_engine_factory_class());
    builder.append(present_storage_engine_factory_class);
    if (present_storage_engine_factory_class)
      builder.append(storage_engine_factory_class);

    boolean present_storage_engine_options = true && (is_set_storage_engine_options());
    builder.append(present_storage_engine_options);
    if (present_storage_engine_options)
      builder.append(storage_engine_options);

    boolean present_partitioner_class = true && (is_set_partitioner_class());
    builder.append(present_partitioner_class);
    if (present_partitioner_class)
      builder.append(partitioner_class);

    boolean present_required_host_flags = true && (is_set_required_host_flags());
    builder.append(present_required_host_flags);
    if (present_required_host_flags)
      builder.append(required_host_flags);

    boolean present_next_version_number = true;
    builder.append(present_next_version_number);
    if (present_next_version_number)
      builder.append(next_version_number);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(DomainMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_id()).compareTo(other.is_set_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_num_partitions()).compareTo(other.is_set_num_partitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_partitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_partitions, other.num_partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_storage_engine_factory_class()).compareTo(other.is_set_storage_engine_factory_class());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_storage_engine_factory_class()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storage_engine_factory_class, other.storage_engine_factory_class);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_storage_engine_options()).compareTo(other.is_set_storage_engine_options());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_storage_engine_options()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storage_engine_options, other.storage_engine_options);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_partitioner_class()).compareTo(other.is_set_partitioner_class());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_partitioner_class()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitioner_class, other.partitioner_class);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_required_host_flags()).compareTo(other.is_set_required_host_flags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_required_host_flags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.required_host_flags, other.required_host_flags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_next_version_number()).compareTo(other.is_set_next_version_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_next_version_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.next_version_number, other.next_version_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DomainMetadata(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_partitions:");
    sb.append(this.num_partitions);
    first = false;
    if (!first) sb.append(", ");
    sb.append("storage_engine_factory_class:");
    if (this.storage_engine_factory_class == null) {
      sb.append("null");
    } else {
      sb.append(this.storage_engine_factory_class);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storage_engine_options:");
    if (this.storage_engine_options == null) {
      sb.append("null");
    } else {
      sb.append(this.storage_engine_options);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitioner_class:");
    if (this.partitioner_class == null) {
      sb.append("null");
    } else {
      sb.append(this.partitioner_class);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("required_host_flags:");
    if (this.required_host_flags == null) {
      sb.append("null");
    } else {
      sb.append(this.required_host_flags);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("next_version_number:");
    sb.append(this.next_version_number);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'num_partitions' because it's a primitive and you chose the non-beans generator.
    if (storage_engine_factory_class == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storage_engine_factory_class' was not present! Struct: " + toString());
    }
    if (storage_engine_options == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storage_engine_options' was not present! Struct: " + toString());
    }
    if (partitioner_class == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitioner_class' was not present! Struct: " + toString());
    }
    if (required_host_flags == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'required_host_flags' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'next_version_number' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainMetadataStandardSchemeFactory implements SchemeFactory {
    public DomainMetadataStandardScheme getScheme() {
      return new DomainMetadataStandardScheme();
    }
  }

  private static class DomainMetadataStandardScheme extends StandardScheme<DomainMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.set_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_partitions = iprot.readI32();
              struct.set_num_partitions_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STORAGE_ENGINE_FACTORY_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storage_engine_factory_class = iprot.readString();
              struct.set_storage_engine_factory_class_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STORAGE_ENGINE_OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storage_engine_options = iprot.readString();
              struct.set_storage_engine_options_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITIONER_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitioner_class = iprot.readString();
              struct.set_partitioner_class_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // REQUIRED_HOST_FLAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.required_host_flags = iprot.readString();
              struct.set_required_host_flags_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // NEXT_VERSION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.next_version_number = iprot.readI32();
              struct.set_next_version_number_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.is_set_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.is_set_num_partitions()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_partitions' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.is_set_next_version_number()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'next_version_number' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_PARTITIONS_FIELD_DESC);
      oprot.writeI32(struct.num_partitions);
      oprot.writeFieldEnd();
      if (struct.storage_engine_factory_class != null) {
        oprot.writeFieldBegin(STORAGE_ENGINE_FACTORY_CLASS_FIELD_DESC);
        oprot.writeString(struct.storage_engine_factory_class);
        oprot.writeFieldEnd();
      }
      if (struct.storage_engine_options != null) {
        oprot.writeFieldBegin(STORAGE_ENGINE_OPTIONS_FIELD_DESC);
        oprot.writeString(struct.storage_engine_options);
        oprot.writeFieldEnd();
      }
      if (struct.partitioner_class != null) {
        oprot.writeFieldBegin(PARTITIONER_CLASS_FIELD_DESC);
        oprot.writeString(struct.partitioner_class);
        oprot.writeFieldEnd();
      }
      if (struct.required_host_flags != null) {
        oprot.writeFieldBegin(REQUIRED_HOST_FLAGS_FIELD_DESC);
        oprot.writeString(struct.required_host_flags);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NEXT_VERSION_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.next_version_number);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainMetadataTupleSchemeFactory implements SchemeFactory {
    public DomainMetadataTupleScheme getScheme() {
      return new DomainMetadataTupleScheme();
    }
  }

  private static class DomainMetadataTupleScheme extends TupleScheme<DomainMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      oprot.writeI32(struct.num_partitions);
      oprot.writeString(struct.storage_engine_factory_class);
      oprot.writeString(struct.storage_engine_options);
      oprot.writeString(struct.partitioner_class);
      oprot.writeString(struct.required_host_flags);
      oprot.writeI32(struct.next_version_number);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.set_id_isSet(true);
      struct.num_partitions = iprot.readI32();
      struct.set_num_partitions_isSet(true);
      struct.storage_engine_factory_class = iprot.readString();
      struct.set_storage_engine_factory_class_isSet(true);
      struct.storage_engine_options = iprot.readString();
      struct.set_storage_engine_options_isSet(true);
      struct.partitioner_class = iprot.readString();
      struct.set_partitioner_class_isSet(true);
      struct.required_host_flags = iprot.readString();
      struct.set_required_host_flags_isSet(true);
      struct.next_version_number = iprot.readI32();
      struct.set_next_version_number_isSet(true);
    }
  }

}

