package orderlist.controller;

import control.Controller;
import handler.HandlerAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import orderlist.DAO.OrderListDAO;
import orderlist.DTO.OrderListDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class OrderListDeleteController implements Controller {
    private static Log log = LogFactory.getLog(OrderListDeleteController.class);
    @Override
    public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
       String orderlist_num = request.getParameter("orderlist_num");
       log.info(orderlist_num);

       OrderListDTO orderlistDTO = new OrderListDTO();
       OrderListDAO orderlistDAO = new OrderListDAO();

       orderlistDTO.setOrderlist_num(orderlist_num);
        request.setAttribute("orderDTO",orderlistDTO);

        orderlistDTO = orderlistDAO.orderlistDelete(orderlist_num);
        log.info(orderlistDTO);

        HandlerAdapter handlerAdapter = new HandlerAdapter();
        handlerAdapter.setPath("./WEB-INF/view/orderlist/orderlist_delete_view.jsp");
        return handlerAdapter;
    }
}
