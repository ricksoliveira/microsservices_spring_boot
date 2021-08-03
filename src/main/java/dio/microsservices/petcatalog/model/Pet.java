package dio.microsservices.petcatalog.model;

import dio.microsservices.petcatalog.helper.Indexes;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = Indexes.PET_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Pet {

    @Id
    @Field(type = FieldType.Keyword)
    private Long id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String race;

    /**
     * <h1>Constructor</h1>
     */

    public Pet(Long id, String name, String race) {
        this.id = id;
        this.name = name;
        this.race = race;
    }

    public Pet() {
    }

    /**
     * <h1>Getters and Setters</h1>
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
