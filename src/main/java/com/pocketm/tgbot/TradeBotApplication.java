package com.pocketm.tgbot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradeBotApplication.class, args);

//        UMFuturesClientImpl client = new UMFuturesClientImpl("cYAtW9S2uwcaTW02NF5lMWVklNzk4SSsiAHsp94vaPlu5v0VQrlw5AwtJ6cXKJOk", "F2a3aliOLpN6DsrrvvuyWhmkbef17lkgYooTfY6g90YdEm74lFGWZ5rWGhZ2lXNi");
//        String result = client.market().historicalBlvt(new LinkedHashMap<>(Map.of("symbol", "BTCDOWN", "interval", "30m")));
//
//        UMFuturesClientImpl client2 = new UMFuturesClientImpl("cYAtW9S2uwcaTW02NF5lMWVklNzk4SSsiAHsp94vaPlu5v0VQrlw5AwtJ6cXKJOk", "F2a3aliOLpN6DsrrvvuyWhmkbef17lkgYooTfY6g90YdEm74lFGWZ5rWGhZ2lXNi");
//        String result2 = client2.market().historicalBlvt(new LinkedHashMap<>(Map.of("symbol", "BTCDOWN", "interval", "30m")));
//
//        System.err.println(result);
//        //System.err.println(result2);

//        UMWebsocketClientImpl client = new UMWebsocketClientImpl(); // defaults to production websocket URL unless stated
//        int streamID1 = client.klineStream("btcusdt", "30m",((event) -> {
//            System.out.println(event);
//        }));

//        ArrayList<String> streams = new ArrayList<>();
//        streams.add("btcusdt@trade");
//        streams.add("bnbusdt@trade");
//
//        int streamID2 = client.combineStreams(streams, ((event) -> {
//            System.out.println(event);
//        }));

    }
}

/*
{
  "e": "kline",     // Event type
  "E": 123456789,   // Event time
  "s": "BNBBTC",    // Symbol
  "k": {
    "t": 123400000, // Kline start time
    "T": 123460000, // Kline close time
    "s": "BNBBTC",  // Symbol
    "i": "1m",      // Interval
    "f": 100,       // First trade ID
    "L": 200,       // Last trade ID
    "o": "0.0010",  // Open price
    "c": "0.0020",  // Close price
    "h": "0.0025",  // High price
    "l": "0.0015",  // Low price
    "v": "1000",    // Base asset volume
    "n": 100,       // Number of trades
    "x": false,     // Is this kline closed?
    "q": "1.0000",  // Quote asset volume
    "V": "500",     // Taker buy base asset volume
    "Q": "0.500",   // Taker buy quote asset volume
    "B": "123456"   // Ignore
  }
}
 */