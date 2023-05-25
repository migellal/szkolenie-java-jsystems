
package dzien4.web.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GPTResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("choices")
    @Expose
    private List<Choice> choices;
    @SerializedName("usage")
    @Expose
    private Usage usage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GPTResponse() {
    }

    /**
     * 
     * @param created
     * @param usage
     * @param model
     * @param id
     * @param choices
     * @param object
     */
    public GPTResponse(String id, String object, String created, String model, List<Choice> choices, Usage usage) {
        super();
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.choices = choices;
        this.usage = usage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GPTResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("choices");
        sb.append('=');
        sb.append(((this.choices == null)?"<null>":this.choices));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.choices == null)? 0 :this.choices.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GPTResponse) == false) {
            return false;
        }
        GPTResponse rhs = ((GPTResponse) other);
        return (((((((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created)))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.choices == rhs.choices)||((this.choices!= null)&&this.choices.equals(rhs.choices))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

}
