// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

public final class ServiceControllerProto {
  private ServiceControllerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/api/servicecontrol/v1/service_c" +
      "ontroller.proto\022\034google.api.servicecontr" +
      "ol.v1\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032.google/api/service" +
      "control/v1/check_error.proto\032,google/api" +
      "/servicecontrol/v1/operation.proto\032\037goog" +
      "le/protobuf/timestamp.proto\032\027google/rpc/" +
      "status.proto\"{\n\014CheckRequest\022\024\n\014service_" +
      "name\030\001 \001(\t\022:\n\toperation\030\002 \001(\0132\'.google.a" +
      "pi.servicecontrol.v1.Operation\022\031\n\021servic" +
      "e_config_id\030\004 \001(\t\"\346\004\n\rCheckResponse\022\024\n\014o" +
      "peration_id\030\001 \001(\t\022>\n\014check_errors\030\002 \003(\0132" +
      "(.google.api.servicecontrol.v1.CheckErro" +
      "r\022\031\n\021service_config_id\030\005 \001(\t\022\032\n\022service_" +
      "rollout_id\030\013 \001(\t\022I\n\ncheck_info\030\006 \001(\01325.g" +
      "oogle.api.servicecontrol.v1.CheckRespons" +
      "e.CheckInfo\032v\n\tCheckInfo\022\030\n\020unused_argum" +
      "ents\030\001 \003(\t\022O\n\rconsumer_info\030\002 \001(\01328.goog" +
      "le.api.servicecontrol.v1.CheckResponse.C" +
      "onsumerInfo\032\204\002\n\014ConsumerInfo\022\026\n\016project_" +
      "number\030\001 \001(\003\022S\n\004type\030\002 \001(\0162E.google.api." +
      "servicecontrol.v1.CheckResponse.Consumer" +
      "Info.ConsumerType\022\027\n\017consumer_number\030\003 \001" +
      "(\003\"n\n\014ConsumerType\022\035\n\031CONSUMER_TYPE_UNSP" +
      "ECIFIED\020\000\022\013\n\007PROJECT\020\001\022\n\n\006FOLDER\020\002\022\020\n\014OR" +
      "GANIZATION\020\003\022\024\n\020SERVICE_SPECIFIC\020\004\"}\n\rRe" +
      "portRequest\022\024\n\014service_name\030\001 \001(\t\022;\n\nope" +
      "rations\030\002 \003(\0132\'.google.api.servicecontro" +
      "l.v1.Operation\022\031\n\021service_config_id\030\003 \001(" +
      "\t\"\341\001\n\016ReportResponse\022O\n\rreport_errors\030\001 " +
      "\003(\01328.google.api.servicecontrol.v1.Repor" +
      "tResponse.ReportError\022\031\n\021service_config_" +
      "id\030\002 \001(\t\022\032\n\022service_rollout_id\030\004 \001(\t\032G\n\013" +
      "ReportError\022\024\n\014operation_id\030\001 \001(\t\022\"\n\006sta" +
      "tus\030\002 \001(\0132\022.google.rpc.Status2\274\003\n\021Servic" +
      "eController\022\216\001\n\005Check\022*.google.api.servi" +
      "cecontrol.v1.CheckRequest\032+.google.api.s" +
      "ervicecontrol.v1.CheckResponse\",\202\323\344\223\002&\"!" +
      "/v1/services/{service_name}:check:\001*\022\222\001\n" +
      "\006Report\022+.google.api.servicecontrol.v1.R" +
      "eportRequest\032,.google.api.servicecontrol" +
      ".v1.ReportResponse\"-\202\323\344\223\002\'\"\"/v1/services" +
      "/{service_name}:report:\001*\032\200\001\312A\035serviceco" +
      "ntrol.googleapis.com\322A]https://www.googl" +
      "eapis.com/auth/cloud-platform,https://ww" +
      "w.googleapis.com/auth/servicecontrolB\370\001\n" +
      " com.google.api.servicecontrol.v1B\026Servi" +
      "ceControllerProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/api/servicecontrol/v1" +
      ";servicecontrol\370\001\001\242\002\004GASC\252\002\036Google.Cloud" +
      ".ServiceControl.V1\312\002\036Google\\Cloud\\Servic" +
      "eControl\\V1\352\002!Google::Cloud::ServiceCont" +
      "rol::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.servicecontrol.v1.CheckErrorProto.getDescriptor(),
          com.google.api.servicecontrol.v1.OperationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_CheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_CheckRequest_descriptor,
        new java.lang.String[] { "ServiceName", "Operation", "ServiceConfigId", });
    internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicecontrol_v1_CheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor,
        new java.lang.String[] { "OperationId", "CheckErrors", "ServiceConfigId", "ServiceRolloutId", "CheckInfo", });
    internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor =
      internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_CheckResponse_CheckInfo_descriptor,
        new java.lang.String[] { "UnusedArguments", "ConsumerInfo", });
    internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor =
      internal_static_google_api_servicecontrol_v1_CheckResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_CheckResponse_ConsumerInfo_descriptor,
        new java.lang.String[] { "ProjectNumber", "Type", "ConsumerNumber", });
    internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicecontrol_v1_ReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_ReportRequest_descriptor,
        new java.lang.String[] { "ServiceName", "Operations", "ServiceConfigId", });
    internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_servicecontrol_v1_ReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor,
        new java.lang.String[] { "ReportErrors", "ServiceConfigId", "ServiceRolloutId", });
    internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor =
      internal_static_google_api_servicecontrol_v1_ReportResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_ReportResponse_ReportError_descriptor,
        new java.lang.String[] { "OperationId", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.servicecontrol.v1.CheckErrorProto.getDescriptor();
    com.google.api.servicecontrol.v1.OperationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
