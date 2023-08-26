import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;

@Entity
@Data
@table(name='Milk_Donation_Listings')
public class Milk_Donation_Listings{
    @id
    @GeneratedValue
    @column(name='Don_id')
    private int Don_id;
    @joinColumn(name='user_id')
    private int user_id;
    @column(name='Availability')
    private String Availability;
    @joincolumn(name='Address')
    private String Collection_Address;
    @column(name = 'Created_at')
    private Timestamp Created_at;
    @column(name = 'Created_by')
    private Timestamp Created_by;

public Milk_Donation_Listings(){}
       //Getting and started
public Milk_Donation_Listings(int Don_id,int user_id,String Availability,String Collection_Address,Timestamp Created_at,String Created_by)
   this.Don_id=Don_id;
   this.user_id=user_id;
   this.Availability=Availability;
   this.Collection_Address=Collection_Address;
   this.Created_at=Created_at;
   this.Created_by=Created_by;
}