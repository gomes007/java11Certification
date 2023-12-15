package IO;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

public class SerialPerson implements Serializable {

    private String name;
    private Integer age;
    private Double salary;


    private static final ObjectStreamField[] serialPersistentFields = {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("age", Integer.class),
            new ObjectStreamField("salary", Double.class)};


    private void writeObject(ObjectOutputStream stream) throws Exception {
        ObjectOutputStream.PutField fields = stream.putFields();
        fields.put("name", name);
        fields.put("age", age);
        stream.writeFields();
    }

    private void readObject(ObjectInputStream s) throws Exception {
        ObjectInputStream.GetField fields = s.readFields();
        this.name = (String) fields.get("name", null);
        this.age = (Integer) fields.get("age", null);
    }


}
