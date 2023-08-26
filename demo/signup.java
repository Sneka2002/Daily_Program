import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;
@Entity
@Data
@table(name ="signup")
public class signup{
    @id
    @GeneratedValue
    @column(name='User_id',columnDefinition='Int',nullable=true)
    private int User_id;
    @id
    @GeneratedValue
    @column(name='Account_type',columnDefinition='varchar(20)',nullable=false)
    private String Account_type;
    @column(name='User_name',columnDefinition='varchar(20)',nullable=false)
    private String User_name;
    @column(name='Password',columnDefinition='varchar(20)',nullable=false)
    private String Password;
    @column(name='Created_at',columnDefinition='Timestamp',nullable=false)
    private Timestamp Created_at;
    @column(name='Created_by',columnDefinition='varchar(20)',nullable=false)
    private String Created_by;

public signup(){}
    //Getting and started
public signup(int User_id,String Account_type,String User_name,String Password,String Password,Timestamp Created_at,String Created_by)
    this.User_id=User_id;
    this.Account_type=Account_type;
    this.User_name=User_name;
    this.Password=Password;
    this.Created_at=Created_at;
    this.Created_by=Created_by;
}
