package rest;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;

import java.io.IOException;

public class RESTDemo2 {

    public static void main(String[] args) throws XmlException, IOException, SoapUIException {

        WsdlProject project = new WsdlProject("C:\\Users\\amolu\\Documents\\Chat-server-july-22-soapui-project.xml");
        WsdlTestSuite suite = project.getTestSuiteByName("TestSuite");

        for(int i=0;i<suite.getTestCaseCount();i++) {

            WsdlTestCase testCase = suite.getTestCaseAt(i);

            System.out.println("Test case="+suite.getTestCaseAt(i).getDescription());

            TestRunner runner = testCase.run(new PropertiesMap(), false);

            System.out.println("runner.getStatus()="+runner.getStatus());
            System.out.println("Status.FINISHED="+TestRunner.Status.FINISHED);
            Assert.assertEquals(TestRunner.Status.FINISHED, runner.getStatus());
        }

    }

}
