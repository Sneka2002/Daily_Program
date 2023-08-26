import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;

@Entity
@Data
@table(name='Notification')
public class Notification{
    @id
    @GeneratedValue
    @column(name='Notify_id')
    private int Notify_id;
    @joincolumn(name='user_id')
    private int user_id;
    @joincolumn(name='Message_content')
    private String Message_content;
    @column(name = 'Created_at')
    private Timestamp Created_at;
    @column(name = 'Created_by')
    private Timestamp Created_by;
    @column(name = 'Updated_at')
    private Timestamp Updated_at;
    @column(name = 'Updated_by')
    private String Updated_by;

public Notification(){}
      //Getting and started
public Notification(int Notify_id,int user_id,String Message_content,Timestamp Created_at,String Created_by,Timestamp Updated_at,String Updated_by)
   this.Notify_id=Notify_id;
   this.user_id=user_id;
   this.Message_content=Message_content;
   this.Created_at=Created_at;
   this.Created_by=Created_by;
   this.Updated_at=Updated_at;
   this.Updated_by=Updated_by;
}