// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v2/service_controller.proto

package com.google.api.servicecontrol.v2;

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
    internal_static_google_api_servicecontrol_v2_CheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_CheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v2_ResourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_ResourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v2_CheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_CheckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v2_CheckResponse_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_CheckResponse_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v2_ReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_ReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v2_ReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v2_ReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/api/servicecontrol/v2/service_c" +
      "ontroller.proto\022\034google.api.servicecontr" +
      "ol.v2\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032*google/rpc/context" +
      "/attribute_context.proto\032\027google/rpc/sta" +
      "tus.proto\"\307\001\n\014CheckRequest\022\024\n\014service_na" +
      "me\030\001 \001(\t\022\031\n\021service_config_id\030\002 \001(\t\0228\n\na" +
      "ttributes\030\003 \001(\0132$.google.rpc.context.Att" +
      "ributeContext\022=\n\tresources\030\004 \003(\0132*.googl" +
      "e.api.servicecontrol.v2.ResourceInfo\022\r\n\005" +
      "flags\030\005 \001(\t\"c\n\014ResourceInfo\022\014\n\004name\030\001 \001(" +
      "\t\022\014\n\004type\030\002 \001(\t\022\022\n\npermission\030\003 \001(\t\022\021\n\tc" +
      "ontainer\030\004 \001(\t\022\020\n\010location\030\005 \001(\t\"\256\001\n\rChe" +
      "ckResponse\022\"\n\006status\030\001 \001(\0132\022.google.rpc." +
      "Status\022I\n\007headers\030\002 \003(\01328.google.api.ser" +
      "vicecontrol.v2.CheckResponse.HeadersEntr" +
      "y\032.\n\014HeadersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\001\"z\n\rReportRequest\022\024\n\014service_na" +
      "me\030\001 \001(\t\022\031\n\021service_config_id\030\002 \001(\t\0228\n\no" +
      "perations\030\003 \003(\0132$.google.rpc.context.Att" +
      "ributeContext\"\020\n\016ReportResponse2\274\003\n\021Serv" +
      "iceController\022\216\001\n\005Check\022*.google.api.ser" +
      "vicecontrol.v2.CheckRequest\032+.google.api" +
      ".servicecontrol.v2.CheckResponse\",\202\323\344\223\002&" +
      "\"!/v2/services/{service_name}:check:\001*\022\222" +
      "\001\n\006Report\022+.google.api.servicecontrol.v2" +
      ".ReportRequest\032,.google.api.servicecontr" +
      "ol.v2.ReportResponse\"-\202\323\344\223\002\'\"\"/v2/servic" +
      "es/{service_name}:report:\001*\032\200\001\312A\035service" +
      "control.googleapis.com\322A]https://www.goo" +
      "gleapis.com/auth/cloud-platform,https://" +
      "www.googleapis.com/auth/servicecontrolB\370" +
      "\001\n com.google.api.servicecontrol.v2B\026Ser" +
      "viceControllerProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/api/servicecontrol/" +
      "v2;servicecontrol\370\001\001\242\002\004GASC\252\002\036Google.Clo" +
      "ud.ServiceControl.V2\312\002\036Google\\Cloud\\Serv" +
      "iceControl\\V2\352\002!Google::Cloud::ServiceCo" +
      "ntrol::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.rpc.context.AttributeContextProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_api_servicecontrol_v2_CheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v2_CheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_CheckRequest_descriptor,
        new java.lang.String[] { "ServiceName", "ServiceConfigId", "Attributes", "Resources", "Flags", });
    internal_static_google_api_servicecontrol_v2_ResourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicecontrol_v2_ResourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_ResourceInfo_descriptor,
        new java.lang.String[] { "Name", "Type", "Permission", "Container", "Location", });
    internal_static_google_api_servicecontrol_v2_CheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicecontrol_v2_CheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_CheckResponse_descriptor,
        new java.lang.String[] { "Status", "Headers", });
    internal_static_google_api_servicecontrol_v2_CheckResponse_HeadersEntry_descriptor =
      internal_static_google_api_servicecontrol_v2_CheckResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v2_CheckResponse_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_CheckResponse_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_servicecontrol_v2_ReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_servicecontrol_v2_ReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_ReportRequest_descriptor,
        new java.lang.String[] { "ServiceName", "ServiceConfigId", "Operations", });
    internal_static_google_api_servicecontrol_v2_ReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_servicecontrol_v2_ReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v2_ReportResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.rpc.context.AttributeContextProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
