package com.yulghun.test;

import com.yulghun.MyJson;
import org.junit.Assert;
import org.junit.Test;


public class MyJsonTest {

    @Test
    public void findValue_MememberAddress1_Test() {
        // arrange
        String jsonString = "{\n\t\"Response\": {\n\t\t\"xsi:noNamespaceSchemaLocation\": \"http://localhost/services/rest/schema/xxx.xsd;local=true;system=BRIGHT\",\n\t\t\"ResponseStatus\": {\n\t\t\t\"StatusCode\": 0,\n\t\t\t\"StatusMessage\": \"Success\"\n\t\t},\n\t\t\"BRIGHTAgents\": {\n\t\t\t\"Agent\": {\n\t\t\t\t\"BrightXXXX\": {\n\t\t\t\t\t\"MemberSourceRecordKey\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberCounty\": \"MONTGOMERY\",\n\t\t\t\t\t\"MemberFullRoleList\": \"Agent,SXXX Active,XXX XXX,System-BRIGHT\",\n\t\t\t\t\t\"MemberJoinDate\": \"2020-02-28\",\n\t\t\t\t\t\"OfficeKey\": 230XXX,\n\t\t\t\t\t\"MemberXXX1\": \"BRIGHT_XXX\",\n\t\t\t\t\t\"MemberBrightXXX\": 0,\n\t\t\t\t\t\"MemberPreviewYN\": 0,\n\t\t\t\t\t\"MemberAssociationsXXX\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberXXX2\": \"1000 Key XXX West\",\n\t\t\t\t\t\"MemberSourceXXX\": \"BRIGHT\",\n\t\t\t\t\t\"MemberMobilePhone\": 61048,\n\t\t\t\t\t\"MemberStateLXXX\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberStateOrXXX\": \"MD\",\n\t\t\t\t\t\"MemberAddress1\": \"1000 Key XXX AVE\",\n\t\t\t\t\t\"MemberFirstName\": \"RP_Office secretary\",\n\t\t\t\t\t\"MemberSubType\": \"Office Secretary\",\n\t\t\t\t\t\"MemberCity\": \"XXX\",\n\t\t\t\t\t\"ModificationTimestamp\": \"XXX-10-22T17:42:50\",\n\t\t\t\t\t\"MemberStateLicense\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberAssociatXXX\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberFullName\": \"RP_Office secretary Branch Office1\",\n\t\t\t\t\t\"OfficeBrokerKeyxxx\": 240257,\n\t\t\t\t\t\"MemberDesignation\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberLicenseExpirationDate\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberLoginId\": 3204591,\n\t\t\t\t\t\"MemberStreetNumber\": 9707,\n\t\t\t\t\t\"OfficeBrokerMlsId\": 3204572,\n\t\t\t\t\t\"MemberSourceRecordID\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberDirectPhone\": 6104870284,\n\t\t\t\t\t\"MemberPrivateEmail\": \"talkingtom1985@gmail.com\",\n\t\t\t\t\t\"MemberMlsId\": 3204591,\n\t\t\t\t\t\"MemberRoleList\": \"XXXX Agent, dwRPTdwST2 Office Secretary, RPTST2 Status Active, RPTST2 System-BRIGHT\",\n\t\t\t\t\t\"SyndicateTo\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberEmaixxl\": \"tttttt@gmail.com\",\n\t\t\t\t\t\"MemberTerminationDate\": \"2020-02-27\",\n\t\t\t\t\t\"MemberType\": \"Staff\",\n\t\t\t\t\t\"MemberKey\": 2300,\n\t\t\t\t\t\"MemberStreetDirPre\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"OfficeMlsId\": \"RPTST2\",\n\t\t\t\t\t\"MemberStatus\": \"Active\",\n\t\t\t\t\t\"MemberStreetExcep\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"MemberStreetSuffix\": \"AVENUE\",\n\t\t\t\t\t\"MemberLastN\": \"Branch Office1\",\n\t\t\t\t\t\"MemberStreetDirSuffix\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"OfficeName\": \"RPQA_TST Branch  OFF1\",\n\t\t\t\t\t\"SourceModificationTimestampXXXXX\": \"2020-02-28T15:22:03\"\n\t\t\t\t},\n\t\t\t\t\"ResourceKey\": 2300\n\t\t\t}\n\t\t},\n\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\"\n\t}\n}";
        String key = "MemberAddress1";
        String expected = "1000 Key XXX AVE";

        // action
        MyJson myJson = new MyJson();
        Object actual = myJson.findValue(key, jsonString);

        // assert
        Assert.assertEquals(expected, actual.toString());
    }


    @Test
    public void findValue_StatusMessage_Test() {
        // arrange
        String jsonString = "{\n\t\"Response\": {\n\t\t\"BRIGHTOffices\": {\n\t\t\t\"Office\": [{\n\t\t\t\t\"ResourceKey\": 230035655534\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035656017\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035656096\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035657429\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230037666253\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230037666259\n\t\t\t}]\n\t\t},\n\t\t\"xsi:noNamespaceSchemaLocation\": \"http://localhost/services/rest/schema/xxx.xsd;local=true;system=BRIGHT\",\n\t\t\"ResponseStatus\": {\n\t\t\t\"StatusCode\": 0,\n\t\t\t\"StatusMessage\": \"Success\"\n\t\t},\n\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\"\n\t}\n}";
        String key = "StatusMessage";
        String expected = "Success";

        // action
        MyJson myJson = new MyJson();
        Object actual = myJson.findValue(key, jsonString);

        // assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValue_PropHistPartyKey_Test() {
        // arrange
        String jsonString = "{\n\t\"Response\": {\n\t\t\"MRISPropHistory\": {\n\t\t\t\"HistoryData\": {\n\t\t\t\t\"Record\": {\n\t\t\t\t\t\"FullStreetAddress\": \"274 LIGHTHOUSE RD\",\n\t\t\t\t\t\"PropHistChangeTypeLkp\": \"New Listing\",\n\t\t\t\t\t\"PropHistKey\": 230041380847,\n\t\t\t\t\t\"PropHistListingKey\": 230049156554,\n\t\t\t\t\t\"PropHistChangeType\": \"NEW\",\n\t\t\t\t\t\"PropHistTableName\": \"LISTINGS\",\n\t\t\t\t\t\"PropHistSubSystemLocale\": \"BRIGHT_MAIN\",\n\t\t\t\t\t\"BasicLocaleListingStatus\": \"ACTIVE\",\n\t\t\t\t\t\"PropHistChangeTimestamp\": \"2020-10-13T13:50:07\",\n\t\t\t\t\t\"PropHistRecordKey\": 230049156554,\n\t\t\t\t\t\"PropHistColumnName\": \"LIS_ID\",\n\t\t\t\t\t\"PropHistOriginalPickListValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistNewPickListValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistItemNumber\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistPartyKey\": 240257644347,\n\t\t\t\t\t\"ListingID\": \"DEKT126890\",\n\t\t\t\t\t\"PropHistSystemLocale\": \"BRIGHT\",\n\t\t\t\t\t\"SystemName\": \"ListingKey\",\n\t\t\t\t\t\"PropHistOriginalColumnValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistNewColumnValue\": 230049156554\n\t\t\t\t},\n\t\t\t\t\"ResourceKey\": 230041380847\n\t\t\t}\n\t\t},\n\t\t\"xsi:noNamespaceSchemaLocation\": \"http://testdata.mris.com/services/rest/schema/mris_data_services.xsd;local=true;system=BRIGHT\",\n\t\t\"ResponseStatus\": {\n\t\t\t\"StatusCode\": 0,\n\t\t\t\"StatusMessage\": \"Success\"\n\t\t},\n\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\"\n\t}\n}";
        String key = "PropHistPartyKey";
        String expected = "240257644347";


        // action
        MyJson myJson = new MyJson();
        Object actual = myJson.findValue(key, jsonString);

        // assert
        Assert.assertEquals(expected, actual.toString());
    }

    @Test
    public void findValue_ResourceKey_FromJSONArray_Test() {
        // arrange
        String jsonString = "{\n\t\"Response\": {\n\t\t\"BRIGHTOffices\": {\n\t\t\t\"Office\": [{\n\t\t\t\t\"ResourceKey\": 230035655534\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035656017\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035656096\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230035657429\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230037666253\n\t\t\t}, {\n\t\t\t\t\"ResourceKey\": 230037666259\n\t\t\t}]\n\t\t},\n\t\t\"xsi:noNamespaceSchemaLocation\": \"http://testdata.mris.com/services/rest/schema/mris_data_services.xsd;local=true;system=BRIGHT\",\n\t\t\"ResponseStatus\": {\n\t\t\t\"StatusCode\": 0,\n\t\t\t\"StatusMessage\": \"Success\"\n\t\t},\n\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\"\n\t}\n}";
        String key = "ResourceKey";
        String expected = "230037666259";

        // action
        MyJson myJson = new MyJson();
        Object actual = myJson.findValue(key, jsonString);

        // assert
        Assert.assertEquals(expected, actual.toString());
    }


//    /**
//     *  This test is only for printing out key value pairs from jsonString
//     */
//    @Test
//    public void printJsonKeys_Test() {
//
//        String jsonString = "{\n\t\"Response\": {\n\t\t\"MRISPropHistory\": {\n\t\t\t\"HistoryData\": {\n\t\t\t\t\"Record\": {\n\t\t\t\t\t\"FullStreetAddress\": \"274 LIGHTHOUSE RD\",\n\t\t\t\t\t\"PropHistChangeTypeLkp\": \"New Listing\",\n\t\t\t\t\t\"PropHistKey\": 230041380847,\n\t\t\t\t\t\"PropHistListingKey\": 230049156554,\n\t\t\t\t\t\"PropHistChangeType\": \"NEW\",\n\t\t\t\t\t\"PropHistTableName\": \"LISTINGS\",\n\t\t\t\t\t\"PropHistSubSystemLocale\": \"BRIGHT_MAIN\",\n\t\t\t\t\t\"BasicLocaleListingStatus\": \"ACTIVE\",\n\t\t\t\t\t\"PropHistChangeTimestamp\": \"2020-10-13T13:50:07\",\n\t\t\t\t\t\"PropHistRecordKey\": 230049156554,\n\t\t\t\t\t\"PropHistColumnName\": \"LIS_ID\",\n\t\t\t\t\t\"PropHistOriginalPickListValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistNewPickListValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistItemNumber\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistPartyKey\": 240257644347,\n\t\t\t\t\t\"ListingID\": \"DEKT126890\",\n\t\t\t\t\t\"PropHistSystemLocale\": \"BRIGHT\",\n\t\t\t\t\t\"SystemName\": \"ListingKey\",\n\t\t\t\t\t\"PropHistOriginalColumnValue\": {\n\t\t\t\t\t\t\"xsi:nil\": true\n\t\t\t\t\t},\n\t\t\t\t\t\"PropHistNewColumnValue\": 230049156554\n\t\t\t\t},\n\t\t\t\t\"ResourceKey\": 230041380847\n\t\t\t}\n\t\t},\n\t\t\"xsi:noNamespaceSchemaLocation\": \"http://testdata.mris.com/services/rest/schema/mris_data_services.xsd;local=true;system=BRIGHT\",\n\t\t\"ResponseStatus\": {\n\t\t\t\"StatusCode\": 0,\n\t\t\t\"StatusMessage\": \"Success\"\n\t\t},\n\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\"\n\t}\n}";
//        MyJson myJson = new MyJson();
//
//        myJson.printJsonKeys(jsonString);
//    }
}
