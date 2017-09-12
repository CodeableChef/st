package retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;

/**
 * Created by yuwang on 2016/8/17.
 */
public interface SelfCheckService {
    @POST("mbdweb/bulkGetUserversion.do")
    Call<List<SelfCheck>> selfChecks(@Body ImeiCheck imeiCheck);
}
