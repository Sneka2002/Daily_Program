import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;

@Entity
@Data
@table(name='User_Details')
public class User_Details {
    @joinColumn(name = 'user_id')
    private int user_id;
    @joinCloumn(name = 'Account_type')
    private String Role;
    @joinColumn(name = 'User_name')
    private String Name;
    @Column(name = 'Aadhar_no')
    private long Aadhar_no;
    @Column(name = 'Age')
    private int Age;
    @column(name = 'E_mail')
    private String E_mail;
    @column(name = 'contact')
    private long contact;
    @column(name = 'Address')
    private String Address;
    @column(name = 'Doctors_Prescription')
    private String Doctors_prescription;
    @column(name = 'Baby_age')
    private int Baby_age;
    @column(name = 'Medical_prescription')
    private String Medical_prescription;
    @column(name = 'Created_at')
    private Timestamp Created_at;
    @column(name = 'Created_by')
    private Timestamp Created_by;
    @column(name = 'Updated_at')
    private Timestamp Updated_at;
    @column(name = 'Updated_by')
    private String Updated_by;

    public User_Details() {
    }

    //Getting and Started
    public User_Details(int user_id, String Role, String Name, String Aadhar_no, int Age, String Email, long contact, String Address, String Doctor_prescription
                    int Baby_age, String Medical_prescription, Timestamp Created_at, String Created_by, Timestamp Updated_at, String Updated_by)
          this.user_id=user_id;
          this.Role=Role;
          this.Name=Name;
          this.Aadhar_no=Aadhar_no;
          this.Age=Age;
          this.Email=Email;
          this.Address=Address;
          this.contact=contact;
          this.Doctor_prescription=Doctor_prescription;
          this.Baby_age=Baby_age;
          this.Medical_prescription=Medical_prescription;
          this.Created_at=Created_at;
          this.Created_by=Created_by;
          this.Updated_at=Updated_at;
          this.Updated_by=Updated_by;
}

