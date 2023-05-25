package dzien4.web.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GPTRequest {
    private String prompt;
    private String model = "text-davinci-003";
    @SerializedName("max_tokens")
    @Expose
    private int maxTokens = 1000;
    private double temperature = 0.7;

    public GPTRequest(String prompt) {
        this.prompt = prompt;
    }

    public GPTRequest(String prompt, String model, int maxTokens, double temperature) {
        this.prompt = prompt;
        this.model = model;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
