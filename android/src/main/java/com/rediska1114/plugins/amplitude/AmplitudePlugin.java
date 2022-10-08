package com.rediska1114.plugins.amplitude;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Amplitude")
public class AmplitudePlugin extends Plugin {

    private Amplitude implementation = new Amplitude();

    @PluginMethod
    public void init(PluginCall call) {
        String instanceName = call.getString("instanceName");
        String apiKey = call.getString("apiKey");

        implementation.init(instanceName, apiKey);

        call.resolve();
    }

    @PluginMethod
    public void setUserProperties(PluginCall call) {
        String instanceName = call.getString("instanceName");
        Object userProperties = call.getObject("userProperties");

        implementation.setUserProperties(instanceName, userProperties);

        call.resolve();
    }

    @PluginMethod
    public void clearUserProperties(PluginCall call) {
        String instanceName = call.getString("instanceName");

        implementation.clearUserProperties(instanceName);

        call.resolve();
    }

    @PluginMethod
    public void setUserId(PluginCall call) {
        String instanceName = call.getString("instanceName");
        String userId = call.getString("userId");

        implementation.setUserId(instanceName, userId);
    }

    @PluginMethod
    public logEvent(PluginCall call) {
        String instanceName = call.getString("instanceName");
        String eventType = call.getString("eventType");

        implementation.logEvent(instanceName, eventType);

        call.resolve();
    }

    @PluginMethod
    public logEventWithProperties(PluginCall call) {
        String instanceName = call.getString("instanceName");
        String eventType = call.getString("eventType");
        Object eventProperties = call.getObject("eventProperties");
        
        implementation.logEventWithProperties(instanceName, eventType, eventProperties);

        call.resolve();
    }

}
