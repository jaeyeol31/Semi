package orderlist.service;

import orderlist.DTO.OrderListDTO;

import javax.naming.NamingException;
import java.util.ArrayList;

public interface OrderListService {
    public ArrayList<OrderListDTO> orderlistSelectAll();
    public OrderListDTO orderlistSelect(String orderlist_num);
    public OrderListDTO orderlistInsert(OrderListDTO orderlistDTO);
    public OrderListDTO orderlistUpdate(OrderListDTO orderlistDTO);
    public OrderListDTO orderlistDelete(String orderlist_num);

 }
