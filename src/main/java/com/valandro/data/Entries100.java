package com.valandro.data;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "entries100")
public class Entries100 {
    public ObjectId id;
    @Field("first_name")
    public String firstName;
    @Field("last_name")
    public String lastName;
    public String email;
    public String gender;
    @Field("ip_address")
    public String ipAddress;
}
