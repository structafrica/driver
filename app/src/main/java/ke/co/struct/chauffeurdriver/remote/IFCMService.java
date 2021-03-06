package ke.co.struct.chauffeurdriver.remote;

import ke.co.struct.chauffeurdriver.model.DataMessage;
import ke.co.struct.chauffeurdriver.model.FCMResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers ({
            "Content-Type: application/json",
            "Authorization: key=AAAA6ycQy9Q:APA91bFdkb23WzOvoldRjMRcoKFaptEUnWuk3p27vDn_co-RS--awugPlBy5BjVzRMBUSs1g0T__UReEnLR3ccnSYrlXh64kQvciDG2xUzwvuI09fmzbBkCqr3vIdV7C-ZZywQcuE9bG"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage (@Body DataMessage body);
}
