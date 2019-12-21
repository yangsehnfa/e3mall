package cn.e3mall.manager.controller;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("findItemById/{itemId}")
    public TbItem findItemById(@PathVariable Long itemId){
        return itemService.findItemById(itemId);

    }
}
