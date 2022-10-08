package com.rediska1114.plugins.amplitude;

import android.util.Log;
import com.amplitude.api.Amplitude;
import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.AmplitudeLogCallback;
import com.amplitude.api.AmplitudeServerZone;
import com.amplitude.api.Identify;
import com.amplitude.api.Plan;
import com.amplitude.api.IngestionMetadata;
import com.amplitude.api.Revenue;

import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;

public class Amplitude {

    public void init(String instanceName, String apiKey) {
        Amplitude.getInstance(instanceName).initialize(activity, apiKey);
    }

    public void setUserProperties(String instanceName, Object userProperties) {
        AmplitudeClient client = Amplitude.getInstance(instanceName);
        client.setUserProperties(properties);
    }

    public void clearUserProperties(String instanceName) {
        AmplitudeClient client = Amplitude.getInstance(instanceName);
        client.clearUserProperties();
    }

    public void setUserId(String instanceName, String userId) {
        AmplitudeClient client = Amplitude.getInstance(instanceName);
        client.setUserId(userId);
    }

    public void logEvent(String instanceName, String eventType) {
        AmplitudeClient client = Amplitude.getInstance(instanceName);
        client.logEvent(eventType);
    }

    public void logEventWithProperties(String instanceName, String eventType, Object eventProperties) {
        AmplitudeClient client = Amplitude.getInstance(instanceName);
        client.logEvent(eventType, eventProperties);
    }
}
