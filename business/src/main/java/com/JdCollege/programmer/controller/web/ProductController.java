package com.JdCollege.programmer.controller.web;

import com.JdCollege.programmer.dto.ProductDTO;
import com.JdCollege.programmer.dto.ResponseDTO;
import com.JdCollege.programmer.service.IProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author LuoHao
 * @QQ 1441432393
 * @WX 18375696578
 * @create 2023
 */
@RestController("WebProductController")
@RequestMapping("/web/product")
public class ProductController {

    @Resource
    private IProductService productService;

    /**
     * 获取首页推荐商品数据
     * @return
     */
    @PostMapping("/recommend_list")
    public ResponseDTO<List<ProductDTO>> getRecommendList(){
        return productService.getRecommendList();
    }

    /**
     * 获取首页热销商品数据
     * @return
     */
    @PostMapping("/sale_list")
    public ResponseDTO<List<ProductDTO>> getSaleList(){
        return productService.getSaleList();
    }

    /**
     * 获取首页高人气商品数据
     * @return
     */
    @PostMapping("/view_list")
    public ResponseDTO<List<ProductDTO>> getViewList(){
        return productService.getViewList();
    }

    /**
     * 首页获取全部菜单数据
     * @param productDTO
     * @return
     */
    @PostMapping("/list")
    public ResponseDTO<List<ProductDTO>> getProductList(@RequestBody ProductDTO productDTO){
        return productService.getProductList(productDTO);
    }

    /**
     * 前台获取最新上线菜单数据
     * @return
     */
    @PostMapping("/new")
    public ResponseDTO<List<ProductDTO>> listByCreateTime(){
        return productService.listByCreateTime();
    }

    /**
     * 前台根据商品id获取商品信息
     * @param productDTO
     * @return
     */
    @PostMapping("/get")
    public ResponseDTO<ProductDTO> getById(@RequestBody ProductDTO productDTO){
        return productService.getById(productDTO);
    }
}
