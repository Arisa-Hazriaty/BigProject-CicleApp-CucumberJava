<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>MoveCard</name>
   <tag></tag>
   <elementGuidId>3fd138f0-06de-48b4-9d89-7590d1b3bb46</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;selector\&quot;: {\n        \&quot;boardId\&quot;: \&quot;${boardId}\&quot;\n    },\n    \&quot;data\&quot;: {\n        \&quot;draggableId\&quot;: \&quot;${draggableIdSource}\&quot;,\n        \&quot;type\&quot;: \&quot;${type}\&quot;,\n        \&quot;source\&quot;: {\n            \&quot;index\&quot;: \&quot;${indexSource}\&quot;,\n            \&quot;droppableId\&quot;: \&quot;${droppableIdSource}\&quot;\n        },\n        \&quot;reason\&quot;: \&quot;${reason}\&quot;,\n        \&quot;mode\&quot;: \&quot;${mode}\&quot;,\n        \&quot;destination\&quot;: {\n            \&quot;droppableId\&quot;: \&quot;${droppableIdDestination}\&quot;,\n            \&quot;index\&quot;: \&quot;${indexDestination}\&quot;\n        },\n        \&quot;combine\&quot;: null\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55Ijp7Il9pZCI6IjYxNWQ0YThiNDNiNzFkNzdlNWJkZDg2OSJ9LCJfaWQiOiI2MTVlYTM2NmJjNGRmN2IzYWQzMzkwNDUiLCJnb29nbGVJZCI6IjEwNDY1NTI4MzY0MTg5MDA5OTc0NCIsImVtYWlsIjoiYXJpc2FoYXpyaWF0eTE2MDQxOTkzQGdtYWlsLmNvbSIsImZ1bGxOYW1lIjoiQXJpc2EgSGF6cmlhdHkiLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hLS9BT2gxNEdpeWNBRVg4NWtzRGRrZUt4RlhlX0h2c3ZDRjgzWTNVNUVOdi0xSj1zOTYtYyIsImJpbyI6IiIsInN0YXR1cyI6IiIsImNyZWF0ZWRBdCI6IjIwMjEtMTAtMDdUMDc6MzY6MDYuMzk2WiIsInVwZGF0ZWRBdCI6IjIwMjEtMTAtMTFUMTM6NTI6MzEuMjgyWiIsIl9fdiI6MH0sImlhdCI6MTYzMzk2MDM1MSwiZXhwIjoxNjM2NTUyMzUxfQ.lQq97KV76_VT2Ptq8YCEp7W19DrS3AbeLeZau_HzbiE</value>
   </httpHeaderProperties>
   <katalonVersion>8.0.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>${url}/cards/position</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url</defaultValue>
      <description></description>
      <id>e5bad784-7300-46c1-bb10-68a6e7e425c8</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.boardId</defaultValue>
      <description></description>
      <id>58a904c4-2c6c-415e-9522-98f91d444aa6</id>
      <masked>false</masked>
      <name>boardId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.type</defaultValue>
      <description></description>
      <id>40ff9e4a-251b-4778-9df8-88ba0c064122</id>
      <masked>false</masked>
      <name>type</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dropabbleIdSource</defaultValue>
      <description></description>
      <id>b5c35531-1db0-4ecf-ae14-2e77145c1697</id>
      <masked>false</masked>
      <name>droppableIdSource</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.reason</defaultValue>
      <description></description>
      <id>f8b37bca-2a61-42a0-b852-890c42c7fda5</id>
      <masked>false</masked>
      <name>reason</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mode</defaultValue>
      <description></description>
      <id>98a8c6c9-8f64-4619-9e73-9477c9fa4d64</id>
      <masked>false</masked>
      <name>mode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dropabbleIdDestination</defaultValue>
      <description></description>
      <id>dd09e6d3-bc2f-4fed-a28f-89b5d119ef3f</id>
      <masked>false</masked>
      <name>droppableIdDestination</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.indexSource</defaultValue>
      <description></description>
      <id>93659705-1687-494a-9545-05f64624f5c8</id>
      <masked>false</masked>
      <name>indexSource</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.indexDestination</defaultValue>
      <description></description>
      <id>84c85bb6-989b-4c43-a50c-99eea39c7a99</id>
      <masked>false</masked>
      <name>indexDestination</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.draggableIdSource</defaultValue>
      <description></description>
      <id>aad623e8-c7a5-427b-86f7-b2d178ea6d13</id>
      <masked>false</masked>
      <name>draggableIdSource</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

WS.verifyElementPropertyValue(response, 'message', &quot;Moving card is success&quot;)
WS.verifyElementPropertyValue(response, 'board.lists[0].cards[0].members[0].fullName', &quot;arisahazriaty16041993@gmail.com&quot;)
WS.verifyElementPropertyValue(response, 'board.lists[0].cards[0].members[0].photoUrl', &quot;Arisa Hazriaty&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
