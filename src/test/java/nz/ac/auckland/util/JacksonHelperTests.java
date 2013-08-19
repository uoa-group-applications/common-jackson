package nz.ac.auckland.util;

import junit.framework.Assert;
import nz.ac.auckland.util.JacksonHelper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JacksonHelperTests {

    @Test
    public void mapSerialization() {
        Map<String, String> data = new HashMap<String, String>();

        data.put("one", "two");

        Assert.assertEquals("{\"one\":\"two\"}", JacksonHelper.serialize(data));
    }

    @Test
    public void allowsEmptyBeans() throws Exception {
        EmptyTestBean bean = new EmptyTestBean();
        String output = JacksonHelper.serialize(bean);
        Assert.assertEquals("{}", output);
    }

    private static class EmptyTestBean {
        // nothing here.
    }

}
