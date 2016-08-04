package jsonsender;


import jsonsender.data.ServerData;
import jsonsender.data.serverinput.*;
import jsonsender.data.serverinput.marginoutput.*;
import jsonsender.data.serverinput.marginoutput.EditMargSet.EditSet;
import jsonsender.data.serverinput.marginoutput.EditMargSet.MapEdit;


import java.util.ArrayList;
import java.util.List;


public class StartClass {


    static final int LENGTH_OF_QUEUE= 10;
    static final int MINIMUM_COUNT_THREADS= 1;
    static final int MAXIMUM_COUNT_THREADS= 8;
    static final   long TIME_OF_THREAD_EXECUTE= 5L;
    static final int TIME_WAIT_FOR_SERVER_ANSWER= 4; // seconds
    static final int COUNT_OF_REPEAT_REQUEST= 2;
    static final int REQUEST_MATCH = 1;
    static final int REQUEST_SET_MARGIN = 4;
    static final int REQUEST_SET= 5;
    static final int REQUEST_MARGIN_LIST= 8;
    static final int REQUEST_SET_MARGIN_EVENT =9;

    static final int REQUEST_EDIT_MARGIN_SET =6;

    static final int REQUEST_DLETE_SET = 7;

    public static void main(String[] args) throws InterruptedException {
        ServerData[] DataArr = new ServerData[100];

        MapSoccer Map1 =  new MapSoccer(2.5f,5.0f,1.45f,  140.0f, 5.0f, 2.37f,
                0.45f, 1.52f, -1.0f, 5.0f, 0.8f, 19.0f,
                5.0f, 1.14f, 2.7f, 0.53f, 0.0f,1.0f, 7.5f,1.01f);
        // Map":{"Confidence":8.0,"2":3.6,"Alpha":9.0,"1":1.26,"marginSetID":83.0}
        MapVolleyball MapV = new MapVolleyball(8.0f,3.6f,9.0f,1.26f,83.0f);

        //{"limit":36.5,"2":1.11,"Alpha":5.0,"Over":1.85,"1":6.27,"Under":1.86,"marginSetID":79.0,"gender":1.0,"numOfSets":5.0}
        MapTennis MapT  =  new MapTennis(36.5f,1.11f,5.0f,1.85f,6.27f,1.86f,79.0f,1.0f,5.0f);

        //{"limit":0.5,"2":4.0,"Over":1.8,"1":2.0,"1P Ratio":0.3116,"Under":1.8,"marginSetID":82.0,"3P Ratio":0.3522,"X":3.0,"2P Ratio":0.3362}
        MapIceHockey MapIh = new MapIceHockey(0.5f,4.0f,1.8f,2.0f,0.3116f,1.8f,82.0f,0.3522f,3.0f,0.3362f);

        //{"2":1.01,"1":15.5,"marginSetID":92.0,"X":19.0}
        MapHandball MapH = new MapHandball(1.01f,15.5f, 0.526f, 92.0f, 0.089f, 19.0f,0.385f);

              /* {"Total Spreads":5.0,"Number_of_halftime_spreads":4.0,"CutOff":0.0,"deviation":11.5,"Points Spreads":5.0,"Under":1.8,
                       "1_2way":1.18,
                "points":-10.5,"Number_of_fulltime_spreads":4.0,"Total Quarters":5.0,"Number_of_quarter_spreads":2.0,"limit":120.5,
                "4th_quarter":0.25,"2st_quarter":0.25,"Over":1.8,"1st_quarter":0.25,"equals":0.07,"marginSetID":81.0,"3rd_quarter":0.25,
                "Trailing margin":-1.0,"2":1.8,"1":1.9,"2_2way":4.4,"Points Spread Quarters":5.0,"possesion":200.0,"Spread point movement":5.0,
                       "Points Spread Halfs":5.0,"Total Halfs":5.0} */

        MapBasketball MapBs =  new MapBasketball(5.0f,4.0f,0.0f,11.5f,5.0f,1.8f,1.18f,-10.5f,4.0f,5.0f,2.0f,120.5f,0.25f,0.25f,1.8f,0.25f,0.07f,
                81.0f,0.25f,-1.0f,1.8f,1.9f,4.4f,5.0f,200.0f,5.0f,5.0f,5.0f);




        ServerData AskS  = new ServerData( new RequestSoccer(1,Map1,"sbEHLGDMhOyU7R34I+A7UQ==",-1,REQUEST_MATCH) );
        ServerData AskV  = new ServerData( new RequestVolleyball(23,MapV,"sbEHLGDMhOyU7R34I+A7UQ==",9711867,REQUEST_MATCH) );
        ServerData AskBs  = new ServerData( new RequestBasketball(2,MapBs,"sbEHLGDMhOyU7R34I+A7UQ==",9212927,REQUEST_MATCH) );
        ServerData AskIHok  = new ServerData( new RequestIceHockey(4,MapIh,"sbEHLGDMhOyU7R34I+A7UQ==",-5131624,REQUEST_MATCH) );
        ServerData AskHb = new ServerData( new RequestHandball(6,MapH,"sbEHLGDMhOyU7R34I+A7UQ==",9594995,REQUEST_MATCH) );
        ServerData AskT = new ServerData( new RequestTennis(5,MapT,"sbEHLGDMhOyU7R34I+A7UQ==",9724965,REQUEST_MATCH) );  // error here




        List<AsyncRequest> tasksTodo = new ArrayList<>();








        Market mmm = new Market(2,"",1,140,0,0.65f,0,40);
        Market mmm2 = new Market(10,"",1,105,0,0.65f,0.7f,40);
        List<Market> markets =new ArrayList<>();
        markets.add(mmm);
        markets.add(mmm2);

        Map map = new Map("Soccer Tier 1",markets);
        MapEdit mapEdit =  new MapEdit(141,markets);


        ServerData EditSets = new ServerData(new EditSet(1,mapEdit,"sbEHLGDMhOyU7R34I+A7UQ==",REQUEST_EDIT_MARGIN_SET));

        CreateMarginS mrg =  new CreateMarginS(1,map,"sds",1);


        ServerData AskMarg = new ServerData( new CreateMarginS(1,map,"sbEHLGDMhOyU7R34I+A7UQ==",REQUEST_SET_MARGIN));

        ReadMarginMap mapm = new ReadMarginMap(141);

        ServerData AskSet = new ServerData(new ReadMarginSet(21,mapm,"sbEHLGDMhOyU7R34I+A7UQ==",REQUEST_DLETE_SET));

/// Asking list of margin all works ok
        ServerData AskListMarg = new ServerData(new ReadMarginsList(1,"sbEHLGDMhOyU7R34I+A7UQ==",REQUEST_MARGIN_LIST));

        ServerData event = new ServerData(new SetMargingSetEvent(1,5,33,9735217,141,"sbEHLGDMhOyU7R34I+A7UQ==",REQUEST_SET_MARGIN_EVENT));



        AsyncRequest testQ  = new AsyncRequest();

        for (int i =0 ; i<100 ; i++) {
            DataArr[i] = AskS;
        }
      /*  DataArr[1] = AskV;
        DataArr[2] = AskBs;
        DataArr[3] = AskIHok;
        DataArr[4] = AskHb;
        DataArr[5] = AskV;
        DataArr[6] = AskT;*/



        /// The use of the dll this style!!

         TaskQueue askQ = new TaskQueue("ksrv13.oddsandmore.com", "33446");
        DataArr =  askQ.ExecuteTasks(DataArr);
     //   System.out.println(testQ.convClassToJson(DataArr[4].getResponceData()));

        System.out.println(" End ");


    }




}