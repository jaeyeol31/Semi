package orderlist.controller;

import control.Controller;
import handler.HandlerAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import orderlist.DAO.OrderListDAO;
import orderlist.DTO.OrderListDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

public class OrderListSelectController implements Controller {
    private static Log log = LogFactory.getLog(OrderListSelectController.class);
    @Override
    public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
        OrderListDTO orderlistDTO  = new OrderListDTO();
        OrderListDAO orderlistDAO  = new OrderListDAO();
        log.info(orderlistDTO);

        ArrayList<OrderListDTO> orderList = new ArrayList<OrderListDTO>();
        orderList = orderlistDAO.orderlistSelectAll();
        log.info(orderList);

        request.setAttribute("orderList",orderList);
        HandlerAdapter handlerAdapter = new HandlerAdapter();
        log.info("주문내역 정보 조회");

        handlerAdapter.setPath("/WEB-INF/view/orderlist/orderlist_select_view.jsp");
        return handlerAdapter;
    }
}
