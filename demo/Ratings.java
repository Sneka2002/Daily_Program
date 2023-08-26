import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.Id;
import java.sql.Timestamp;

@Entity
@Data
@table(name='Ratings')
public class Ratings{
    @id
    @GeneratedValue
    @Column(name='Rating_id')
    private int Ratings_id;
    @joincolumn(name='user_id')
    private int user_id;
    @column(name='Ratings')
    private int Ratings;
    @column(name='Feedback')
    private String Feedback;
    @column(name = 'Created_at')
    private Timestamp Created_at;
    @column(name = 'Created_by')
    private Timestamp Created_by;

public Ratings(){}
       //Getting and started
public Ratings(int Rating_id,int user_id,int Ratings,String Feedback,Timestamp Created_at,String Created_by)
   this.Rating_id=Rating_id;
   this.user_id=user_id;
   this.Ratings=Ratings;
   this.Feedback=Feedback;
   this.Created_at=Created_at;
   this.Created_by=Created_by;
}