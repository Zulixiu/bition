package io.sq.bitcoinexplorer0613.controller;

import io.sq.bitcoinexplorer0613.dto.BlockGetDTO;
import io.sq.bitcoinexplorer0613.dto.BlockListDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("block")
public class BlockController {
    @GetMapping("getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks(){
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        BlockListDTO blockListDTO = new BlockListDTO();
        blockListDTO.setBlockhash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockListDTO.setHeight(580644);
        blockListDTO.setTime(new Date());
        blockListDTO.setTxsize((short)2390);
        blockListDTO.setSize(1254899);
        blockListDTOS.add(blockListDTO);

        BlockListDTO blockListDTO2 = new BlockListDTO();
        blockListDTO2.setBlockhash("00000000000000000024b3d4793dcbba032d3fc28a0d77a37d466b956fb68aa5");
        blockListDTO2.setHeight(580004);
        blockListDTO2.setTime(new Date());
        blockListDTO2.setTxsize((short)2110);
        blockListDTO2.setSize(1254789);
        blockListDTOS.add(blockListDTO2);

        return blockListDTOS;
    }

    @GetMapping("getByBlockhash")
    public BlockGetDTO getByBlockhash(@RequestParam String blcokhash){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDTO.setHeight(467899);
        blockGetDTO.setPrevBlock("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setNextBlock("000000000000000000054567036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setMerkleRoot("000000000000000000455ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setFees(8979.56);
        blockGetDTO.setTxsize((short)4565);
        blockGetDTO.setSize(67645123);
        blockGetDTO.setDifficulty(846531275456.24);

        return blockGetDTO;
    }

    @GetMapping("getByHeight")
    public BlockGetDTO getByHeight(@RequestParam Integer height){
        BlockGetDTO blockGetDTO = new BlockGetDTO();
        blockGetDTO.setBlockhash("00000000000000000001ce5f88601a311f1c73c0073a15fe4e5956da7fbcd78b");
        blockGetDTO.setHeight(3012355);
        blockGetDTO.setPrevBlock("00000000000000000005ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setNextBlock("000000000000000000054567036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setMerkleRoot("000000000000000000455ac7036789bfec28d230dff491f3382f6daf6523f5c44");
        blockGetDTO.setTime(new Date().getTime());
        blockGetDTO.setFees(1234.94);
        blockGetDTO.setTxsize((short)9845);
        blockGetDTO.setSize(789456132);
        blockGetDTO.setDifficulty(784517893244.19);
        return blockGetDTO;
    }
}
