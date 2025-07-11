// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationResource;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.FailureAction;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMode;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RollingUpgradeMonitoringPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceTypeHealthPolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApplicationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"managedIdentities\":[{\"name\":\"hocxvdfffwafqrou\",\"principalId\":\"aspavehhr\"},{\"name\":\"kbunzoz\",\"principalId\":\"dhcxgkmoy\"},{\"name\":\"cdyuibhmfdnbzyd\",\"principalId\":\"f\"},{\"name\":\"fcjnaeoisrvhmgor\",\"principalId\":\"fukiscvwmzhw\"}],\"provisioningState\":\"Succeeded\",\"version\":\"gnhnzeyq\",\"parameters\":{\"dbeesmie\":\"jfzqlqhycavodgg\",\"wqfbylyrfgiagt\":\"nlrariaawiuagy\",\"zjvusfzldmo\":\"ojocqwogf\",\"own\":\"uxylfsbtkadpy\"},\"upgradePolicy\":{\"applicationHealthPolicy\":{\"considerWarningAsError\":false,\"maxPercentUnhealthyDeployedApplications\":1188867128,\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":792325056,\"maxPercentUnhealthyPartitionsPerService\":403303744,\"maxPercentUnhealthyReplicasPerPartition\":1343904651},\"serviceTypeHealthPolicyMap\":{\"cmisofie\":{\"maxPercentUnhealthyServices\":508604725,\"maxPercentUnhealthyPartitionsPerService\":1010221539,\"maxPercentUnhealthyReplicasPerPartition\":490054164}}},\"forceRestart\":true,\"rollingUpgradeMonitoringPolicy\":{\"failureAction\":\"Manual\",\"healthCheckWaitDuration\":\"jy\",\"healthCheckStableDuration\":\"dh\",\"healthCheckRetryTimeout\":\"u\",\"upgradeTimeout\":\"lcplc\",\"upgradeDomainTimeout\":\"khihihlhzds\"},\"instanceCloseDelayDuration\":2248945719770323903,\"upgradeMode\":\"UnmonitoredAuto\",\"upgradeReplicaSetCheckTimeout\":4511642520735539935,\"recreateApplication\":true}},\"tags\":{\"e\":\"fgmvecactxmwo\",\"ekqvgqouwif\":\"owcluqo\",\"ivqikfxcvhr\":\"mpjw\"},\"identity\":{\"principalId\":\"huagrttikteusqc\",\"tenantId\":\"vyklxuby\",\"type\":\"None\",\"userAssignedIdentities\":{\"brta\":{\"principalId\":\"fblcq\",\"clientId\":\"ubgq\"},\"qseypxiutcxa\":{\"principalId\":\"etttwgdslqxihhr\",\"clientId\":\"oi\"},\"abrqnkkzj\":{\"principalId\":\"hyrpetogebjoxs\",\"clientId\":\"vnh\"},\"qbeitpkxztmoob\":{\"principalId\":\"b\",\"clientId\":\"gaehvvibrxjjst\"}}},\"location\":\"ft\",\"id\":\"gfcwqmpimaqxzhem\",\"name\":\"yhohujswtwkozzwc\",\"type\":\"lkb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ApplicationResource response = manager.applications()
            .define("ktwkuziyc")
            .withExistingManagedCluster("ril", "zapeewchpx")
            .withRegion("rbbcevq")
            .withTags(mapOf("hqyikvy", "qyuvvfonkp", "vluwmncsttij", "auy"))
            .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.NONE)
                .withUserAssignedIdentities(
                    mapOf("gkynscliqh", new UserAssignedIdentity(), "dxzxhi", new UserAssignedIdentity())))
            .withManagedIdentities(Arrays
                .asList(new ApplicationUserAssignedIdentity().withName("ufuztcktyhjtq").withPrincipalId("dcgzul")))
            .withVersion("zgkrvqe")
            .withParameters(mapOf("t", "oepry", "fvaawzqa", "wytpzdmovz"))
            .withUpgradePolicy(new ApplicationUpgradePolicy()
                .withApplicationHealthPolicy(new ApplicationHealthPolicy().withConsiderWarningAsError(true)
                    .withMaxPercentUnhealthyDeployedApplications(97417905)
                    .withDefaultServiceTypeHealthPolicy(
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1828408441)
                            .withMaxPercentUnhealthyPartitionsPerService(1869010035)
                            .withMaxPercentUnhealthyReplicasPerPartition(1067396685))
                    .withServiceTypeHealthPolicyMap(mapOf("ndtic",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1058037553)
                            .withMaxPercentUnhealthyPartitionsPerService(335381913)
                            .withMaxPercentUnhealthyReplicasPerPartition(1970549549),
                        "zmlqtmldgxo",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1691117977)
                            .withMaxPercentUnhealthyPartitionsPerService(687349800)
                            .withMaxPercentUnhealthyReplicasPerPartition(675680646),
                        "clnpkci",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1135591058)
                            .withMaxPercentUnhealthyPartitionsPerService(1794047018)
                            .withMaxPercentUnhealthyReplicasPerPartition(1646739085))))
                .withForceRestart(false)
                .withRollingUpgradeMonitoringPolicy(
                    new RollingUpgradeMonitoringPolicy().withFailureAction(FailureAction.ROLLBACK)
                        .withHealthCheckWaitDuration("ykhyawfvjlboxqvk")
                        .withHealthCheckStableDuration("lmxhomdyn")
                        .withHealthCheckRetryTimeout("dwdigumb")
                        .withUpgradeTimeout("raauzzpt")
                        .withUpgradeDomainTimeout("a"))
                .withInstanceCloseDelayDuration(8740215687103788004L)
                .withUpgradeMode(RollingUpgradeMode.UNMONITORED_AUTO)
                .withUpgradeReplicaSetCheckTimeout(5386759909033236623L)
                .withRecreateApplication(true))
            .create();

        Assertions.assertEquals("fgmvecactxmwo", response.tags().get("e"));
        Assertions.assertEquals(ManagedIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("ft", response.location());
        Assertions.assertEquals("hocxvdfffwafqrou", response.managedIdentities().get(0).name());
        Assertions.assertEquals("aspavehhr", response.managedIdentities().get(0).principalId());
        Assertions.assertEquals("gnhnzeyq", response.version());
        Assertions.assertEquals("jfzqlqhycavodgg", response.parameters().get("dbeesmie"));
        Assertions.assertFalse(response.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(1188867128,
            response.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(792325056,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(403303744,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1343904651,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(508604725,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("cmisofie")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1010221539,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("cmisofie")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(490054164,
            response.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("cmisofie")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertTrue(response.upgradePolicy().forceRestart());
        Assertions.assertEquals(FailureAction.MANUAL,
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("jy",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("dh",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("u",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("lcplc", response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("khihihlhzds",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(2248945719770323903L, response.upgradePolicy().instanceCloseDelayDuration());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, response.upgradePolicy().upgradeMode());
        Assertions.assertEquals(4511642520735539935L, response.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertTrue(response.upgradePolicy().recreateApplication());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
