<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE sailpoint PUBLIC "sailpoint.dtd" "sailpoint.dtd">

<sailpoint>
  <ImportAction name="merge">
    <Configuration name="ConnectorRegistry">
      <Attributes>
        <Map>
          <entry key="applicationTemplates">
            <value>
              <List>

                <Application
                  connector="sailpoint.connector.OpenConnectorAdapter"
                  featuresString="PROVISIONING, SYNC_PROVISIONING, SEARCH, ENABLE, UNSTRUCTURED_TARGETS, DISCOVER_SCHEMA, ACCOUNT_ONLY_REQUEST"          icon="internet"
                  name="CustomDBConnector"
                  profileClass=""
                  type="CustomDBConnector">

                  <Attributes>
                    <Map>
                      <entry key="authSearchAttributes">
                        <value>
                          <List>
                            <String>UserID</String>
                          </List>
                        </value>
                      </entry>

                      <entry key="compositeDefinition"/>
                      <entry key="connectorClass" value="openconnector.CustomDBConnector"/>
                      <entry key="formPath" value="CustomDBConnector.xhtml"/>
                      <entry key="nativeEntitlementAttributeScope" value="entitlements"/>
                      <entry key="nativeChangeDetectionAttributes"/>
                      <entry key="nativeChangeDetectionEnabled"><value><Boolean>false</Boolean></value></entry>
                      <entry key="nativeChangeDetectionOperations"/>
                    </Map>
                  </Attributes>

                  <Schemas>
                    <Schema displayAttribute="" identityAttribute="username" nativeObjectType="account" objectType="account"/>
                    <Schema displayAttribute="" identityAttribute="groups" nativeObjectType="group" objectType="group"/>
                  </Schemas>

                </Application>

              </List>
            </value>
          </entry>
        </Map>
      </Attributes>
    </Configuration>
  </ImportAction>
</sailpoint>