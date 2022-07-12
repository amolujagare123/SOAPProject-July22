package soap;

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

public class SOAPDemo1 {

    public static void main(String[] args) throws XmlException, IOException, SoapUIException {

        WsdlProject project = new WsdlProject("C:\\Users\\amolu\\Documents\\Employee-Service-june-22-Batch-soapui-project.xml");
        WsdlTestSuite suite = project.getTestSuiteByName("TestSuite");

        WsdlTestCase testCase = suite.getTestCaseByName("E2E Scenario");

        TestRunner runner = testCase.run(new PropertiesMap(), false);

        System.out.println(runner.getStatus());
        System.out.println(TestRunner.Status.FINISHED);
        Assert.assertEquals(TestRunner.Status.FINISHED, runner.getStatus());

    }

}
