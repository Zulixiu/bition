package io.sq.bitcoinexplorer0613.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BitcoinJsonRpcApi {
//a
    //vbb
    JSONObject getBlockChainInfo() throws Throwable;

    JSONObject getmempool() throws Throwable;

    JSONObject getmempoolcontents() throws Throwable;

    JSONObject getTransactionsByhash(String txhash)throws Throwable;

    JSONObject getblockhashbyheight(Integer height)throws Throwable;

    JSONArray getBlockheaders(Integer count, String blockhash)throws Throwable;

    JSONObject getBlockByblockhash(String blockhash)throws Throwable;
}
