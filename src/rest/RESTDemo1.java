package rest;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;

import java.io.IOException;

public class RESTDemo1 {

    public static void main(String[] args) throws XmlException, IOException, SoapUIException {

        WsdlProject project = new WsdlProject("C:\\Users\\amolu\\Documents\\Chat-server-july-22-soapui-project.xml");

        WsdlTestSuite testSuite = project.getTestSuiteByName("TestSuite");

        WsdlTestCase testCase = testSuite.getTestCaseByName("create and get");

        TestRunner runner = testCase.run(new PropertiesMap(), false);

        Assert.assertEquals(TestRunner.Status.FINISHED,runner.getStatus());
    }
}
