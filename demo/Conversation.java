import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;

@Entity
@Data
@table(name='Conversation')
public class Conversation{
    @id
    @GeneratedValue
    @column(name='Conver_id')
    private int Conver_id;
    @joincolumn(name='user_id')
    private int sender_id;
    @joincolumn(name='user_id')
    private int receiver_id;
    @column(name='Message_content')
    private String Message_content;
    @column(name = 'Created_at')
    private Timestamp Created_at;
    @column(name = 'Created_by')
    private Timestamp Created_by;
    @column(name = 'Updated_at')
    private Timestamp Updated_at;
    @column(name = 'Updated_by')
    private String Updated_by;

public Conversation(){}
     //Getting and started
public Conversation(int Conver_id,int sender_id,int receiver_id,timestamp Created_at,String Created_by,Timestamp Updated_at,String Updated_by)
    this.Conver_id=Conver_id;
    this.sender_id=sender_id;
    this.receiver_id=receiver_id;
    this.Message_content=Message_content;
    this.Created_at=Created_at;
    this.Created_by=Created_by;
    this.Updated_at=Updated_at;
    this.Updated_by=Updated_by;
}