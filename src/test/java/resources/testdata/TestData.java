package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Data set
 *
 * |jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
 * |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
 */
public class TestData {
    @DataProvider(name ="cvlibraryjobsearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                {"Banking","Kent","10 miles","5000","7000","Per month","Contract","Contract Banking jobs in Kent"},
                {"Customer Searvices","Bradford","2 miles","300","500","Per week","Temporary","Temporary Customer Searvices jobs in Bradford"},
                {"Admin & Administration","Edinburgh","7 miles","100","150","Per day","Part Time","Part Time Admin & Administration jobs in Edinburgh"},
                {"IT","Birmingham","15 miles","30","50","Per hour","Apprenticeship","Apprenticeship It jobs in Birmingham"},
                {"Education","Coventry","1 mile","3000000","5000000","Per annum","Permanent","Permanent Education jobs in Coventry"},
                {"Healthcare","Cardiff"," 100 miles","30","50","Per month","Part Time","Part Time Healthcare jobs in Cardiff"}
        };
        return data;
    }



}
