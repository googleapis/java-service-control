/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.servicecontrol.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.servicecontrol.v1.stub.ServiceControllerStub;
import com.google.api.servicecontrol.v1.stub.ServiceControllerStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: [Google Service Control API](/service-control/overview)
 *
 * <p>Lets clients check and report operations against a [managed
 * service](https://cloud.google.com/service-management/reference/rpc/google.api/servicemanagement.v1#google.api.servicemanagement.v1.ManagedService).
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
 *   CheckRequest request =
 *       CheckRequest.newBuilder()
 *           .setServiceName("serviceName-1928572192")
 *           .setOperation(Operation.newBuilder().build())
 *           .setServiceConfigId("serviceConfigId650537426")
 *           .build();
 *   CheckResponse response = serviceControllerClient.check(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ServiceControllerClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ServiceControllerSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * ServiceControllerSettings serviceControllerSettings =
 *     ServiceControllerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ServiceControllerClient serviceControllerClient =
 *     ServiceControllerClient.create(serviceControllerSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ServiceControllerSettings serviceControllerSettings =
 *     ServiceControllerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ServiceControllerClient serviceControllerClient =
 *     ServiceControllerClient.create(serviceControllerSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ServiceControllerClient implements BackgroundResource {
  private final ServiceControllerSettings settings;
  private final ServiceControllerStub stub;

  /** Constructs an instance of ServiceControllerClient with default settings. */
  public static final ServiceControllerClient create() throws IOException {
    return create(ServiceControllerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ServiceControllerClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ServiceControllerClient create(ServiceControllerSettings settings)
      throws IOException {
    return new ServiceControllerClient(settings);
  }

  /**
   * Constructs an instance of ServiceControllerClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(ServiceControllerSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ServiceControllerClient create(ServiceControllerStub stub) {
    return new ServiceControllerClient(stub);
  }

  /**
   * Constructs an instance of ServiceControllerClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ServiceControllerClient(ServiceControllerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ServiceControllerStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ServiceControllerClient(ServiceControllerStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ServiceControllerSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ServiceControllerStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks whether an operation on a service should be allowed to proceed based on the
   * configuration of the service and related policies. It must be called before the operation is
   * executed.
   *
   * <p>If feasible, the client should cache the check results and reuse them for 60 seconds. In
   * case of any server errors, the client should rely on the cached results for much longer time to
   * avoid outage. WARNING: There is general 60s delay for the configuration and policy propagation,
   * therefore callers MUST NOT depend on the `Check` method having the latest policy information.
   *
   * <p>NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the size limit
   * (wire-format byte size) of 1MB.
   *
   * <p>This method requires the `servicemanagement.services.check` permission on the specified
   * service. For more information, see [Cloud IAM](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
   *   CheckRequest request =
   *       CheckRequest.newBuilder()
   *           .setServiceName("serviceName-1928572192")
   *           .setOperation(Operation.newBuilder().build())
   *           .setServiceConfigId("serviceConfigId650537426")
   *           .build();
   *   CheckResponse response = serviceControllerClient.check(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckResponse check(CheckRequest request) {
    return checkCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks whether an operation on a service should be allowed to proceed based on the
   * configuration of the service and related policies. It must be called before the operation is
   * executed.
   *
   * <p>If feasible, the client should cache the check results and reuse them for 60 seconds. In
   * case of any server errors, the client should rely on the cached results for much longer time to
   * avoid outage. WARNING: There is general 60s delay for the configuration and policy propagation,
   * therefore callers MUST NOT depend on the `Check` method having the latest policy information.
   *
   * <p>NOTE: the [CheckRequest][google.api.servicecontrol.v1.CheckRequest] has the size limit
   * (wire-format byte size) of 1MB.
   *
   * <p>This method requires the `servicemanagement.services.check` permission on the specified
   * service. For more information, see [Cloud IAM](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
   *   CheckRequest request =
   *       CheckRequest.newBuilder()
   *           .setServiceName("serviceName-1928572192")
   *           .setOperation(Operation.newBuilder().build())
   *           .setServiceConfigId("serviceConfigId650537426")
   *           .build();
   *   ApiFuture<CheckResponse> future = serviceControllerClient.checkCallable().futureCall(request);
   *   // Do something.
   *   CheckResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CheckRequest, CheckResponse> checkCallable() {
    return stub.checkCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports operation results to Google Service Control, such as logs and metrics. It should be
   * called after an operation is completed.
   *
   * <p>If feasible, the client should aggregate reporting data for up to 5 seconds to reduce API
   * traffic. Limiting aggregation to 5 seconds is to reduce data loss during client crashes.
   * Clients should carefully choose the aggregation time window to avoid data loss risk more than
   * 0.01% for business and compliance reasons.
   *
   * <p>NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has the size limit
   * (wire-format byte size) of 1MB.
   *
   * <p>This method requires the `servicemanagement.services.report` permission on the specified
   * service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
   *   ReportRequest request =
   *       ReportRequest.newBuilder()
   *           .setServiceName("serviceName-1928572192")
   *           .addAllOperations(new ArrayList<Operation>())
   *           .setServiceConfigId("serviceConfigId650537426")
   *           .build();
   *   ReportResponse response = serviceControllerClient.report(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportResponse report(ReportRequest request) {
    return reportCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reports operation results to Google Service Control, such as logs and metrics. It should be
   * called after an operation is completed.
   *
   * <p>If feasible, the client should aggregate reporting data for up to 5 seconds to reduce API
   * traffic. Limiting aggregation to 5 seconds is to reduce data loss during client crashes.
   * Clients should carefully choose the aggregation time window to avoid data loss risk more than
   * 0.01% for business and compliance reasons.
   *
   * <p>NOTE: the [ReportRequest][google.api.servicecontrol.v1.ReportRequest] has the size limit
   * (wire-format byte size) of 1MB.
   *
   * <p>This method requires the `servicemanagement.services.report` permission on the specified
   * service. For more information, see [Google Cloud IAM](https://cloud.google.com/iam).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
   *   ReportRequest request =
   *       ReportRequest.newBuilder()
   *           .setServiceName("serviceName-1928572192")
   *           .addAllOperations(new ArrayList<Operation>())
   *           .setServiceConfigId("serviceConfigId650537426")
   *           .build();
   *   ApiFuture<ReportResponse> future =
   *       serviceControllerClient.reportCallable().futureCall(request);
   *   // Do something.
   *   ReportResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReportRequest, ReportResponse> reportCallable() {
    return stub.reportCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
