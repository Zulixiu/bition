package io.sq.bitcoinexplorer0613.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import io.sq.bitcoinexplorer0613.api.BitcoinRestApi;
import io.sq.bitcoinexplorer0613.api.imp.BitconJsonRpcApiImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TestApiController {
    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @Autowired
    private BitconJsonRpcApiImp bitconJsonRpcApi;

   @GetMapping("/chaininfo")
   public String getBlockChainInfo() throws Throwable {
       JSONObject blocks= bitconJsonRpcApi.getBlockChainInfo();
       return blocks.toJSONString();
   }

    @GetMapping("/mempool/info")
    public String getmempool() throws Throwable {
        JSONObject getmempool = bitconJsonRpcApi.getmempool();
        return getmempool.toJSONString();
    }

    @GetMapping("/mempool/contents")
    public String getmempoolcontents() throws Throwable {
        JSONObject getmempoolcontents = bitconJsonRpcApi.getmempoolcontents();
        return getmempoolcontents.toJSONString();
    }

    @GetMapping("/tx/{txhash}")
    public String getTransactionsByhash(@PathVariable String txhash) throws Throwable {
        JSONObject transactionsByhash = bitconJsonRpcApi.getTransactionsByhash(txhash);
        return transactionsByhash.toJSONString();
    }

    @GetMapping("/blockhashbyheight/{height}")
    public String getblockhashbyheight(@PathVariable Integer height) throws Throwable {
        JSONObject getblockhashbyheight = bitconJsonRpcApi.getblockhashbyheight(height);
        return getblockhashbyheight.toJSONString();
    }

    @GetMapping("/headers/{count}/{blockhash}")
    public JSONArray getBlockheaders(@PathVariable Integer count, @PathVariable String blockhash) throws Throwable {
        JSONArray blockheaders = bitconJsonRpcApi.getBlockheaders(count, blockhash);
        return blockheaders;
    }

    @GetMapping("/block/{blockhash}")
    public String getBlockByblockhash(@PathVariable String blockhash) throws Throwable {
        JSONObject blockByblockhash = bitconJsonRpcApi.getBlockByblockhash(blockhash);
        return blockByblockhash.toJSONString();
    }



}
