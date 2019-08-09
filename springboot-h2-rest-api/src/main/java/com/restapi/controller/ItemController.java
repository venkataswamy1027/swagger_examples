package com.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.constant.Constant;
import com.restapi.model.Item;
import com.restapi.service.ItemService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ItemController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	@ApiOperation(value = "Retrive all items from database", notes = Constant.GET_ALL_ITEMS_NOTES)
	@GetMapping("/items")
	public List<Item> getAllItems() {
		LOGGER.info("getAllItems method executed");
		return itemService.list();
	}

	@ApiOperation(value = "Retrive item from database", notes = Constant.GET_SIGNLE_ITEM_NOTES)
	@GetMapping("/item/{itemId}")
	public Item getItem(@PathVariable int itemId) {
		LOGGER.info("getItem method executed");
		return itemService.getItemById(itemId);
	}

	@ApiOperation(value = "Create item to store in database", notes = Constant.CREATE_ITEM_NOTES)
	@PostMapping("/item")
	public Item addItem(@RequestBody Item item) {
		LOGGER.info("addItem method executed");
		return itemService.createItem(item);
	}

	@ApiOperation(value = "Update item and store it in database", notes = Constant.UPDATE_SIGNLE_ITEM_NOTES)
	@PutMapping("/item/{itemId}")
	public Item updateItem(@RequestBody Item item, @PathVariable int itemId) {
		LOGGER.info("updateItem method executed");
		return itemService.update(item, itemId);
	}

	@ApiOperation(value = "Delete item from database", notes = Constant.GET_SIGNLE_ITEM_NOTES)
	@DeleteMapping("/item/{itemId}")
	public String deleteItem(@PathVariable int itemId) {
		LOGGER.info("deleteItem method executed");
		itemService.delete(itemId);
		return "item " + itemId + " deleted successfully.";
	}
}
