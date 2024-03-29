package io.sq.bitcoinexplorer0613.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BitcoinRestApi", url = "http://localhost:18332")
public interface BitcoinRestApi {

    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainInfo();

    @GetMapping("/rest/mempool/info.json")
    JSONObject getmempool();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getmempoolcontents();

    @GetMapping("/rest/tx/{txhash}.json")
    JSONObject getTransactionsByhash(@PathVariable String txhash);

    @GetMapping("/rest/blockhashbyheight/{height}.json")
    JSONObject getblockhashbyheight(@PathVariable Integer height);

    @GetMapping("/rest/headers/{count}/{blockhash}.json")
    JSONArray getBlockheaders(@PathVariable Integer count, @PathVariable String blockhash);

    @GetMapping("/rest/block/{blockhash}.json")
    JSONObject getBlockByblockhash(@PathVariable String blockhash);

}
