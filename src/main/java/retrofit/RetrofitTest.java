package retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by yuwang on 2017/5/23.
 */
public class RetrofitTest {
    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SelfCheckService selfCheckService = retrofit.create(SelfCheckService.class);
        ImeiCheck imeiCheck = new ImeiCheck(1, "0");
        Call<List<SelfCheck>> selfChecksCall = selfCheckService.selfChecks(imeiCheck);
        List<SelfCheck> selfChecks = selfChecksCall.execute().body();
        System.out.println();
    }
}
