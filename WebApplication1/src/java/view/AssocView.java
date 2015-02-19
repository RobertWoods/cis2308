package view;

// classes imported from java.sql.*
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// classes in my project
import dbUtils.DbConn;
import dbUtils.FormatUtils;
 
public class AssocView {

    /* This method returns a HTML table displaying all the records of the web_user table. 
     * cssClassForResultSetTable: the name of a CSS style that will be applied to the HTML table.
     *   (This style should be defined in the JSP page (header or style sheet referenced by the page).
     * dbc: an open database connection.
     */
    public static String listAllUsers(String cssClassForResultSetTable, DbConn dbc) {
        StringBuilder sb = new StringBuilder("");
        PreparedStatement stmt = null;
        ResultSet results = null;
        try {
            //sb.append("ready to create the statement & execute query " + "<br/>");
            String sql = "select appoint_id, date_made,date_appoint,user_email,listing_addr,offer from web_user,appointment,propertylisting where appointment.listing_id = propertylisting.listing_id and appointment.web_user_id = web_user.web_user_id order by appoint_id;";
            stmt = dbc.getConn().prepareStatement(sql);
            results = stmt.executeQuery();
            //sb.append("executed the query " + "<br/><br/>");
            sb.append("<table class='");
            sb.append(cssClassForResultSetTable);
            sb.append("'>");
            sb.append("<tr>");
            sb.append("<th style='text-align:right'>ID</th>");
            sb.append("<th style='text-align:left'>Date Made</th>");
            sb.append("<th style='text-align:left'>Date</th>");
            sb.append("<th style='text-align:left'>User</th>");
            sb.append("<th style='text-align:center'>Address</th>");
            sb.append("<th style='text-align:center'>Offer</th>");
            while (results.next()) {
                sb.append("<tr>");
                sb.append(FormatUtils.formatIntegerTd(results.getObject("appoint_id")));
                sb.append(FormatUtils.formatDateTd(results.getObject("date_made")));
                sb.append(FormatUtils.formatDateTd(results.getObject("date_appoint")));
                sb.append(FormatUtils.formatStringTd(results.getObject("user_email")));
                sb.append(FormatUtils.formatStringTd(results.getObject("listing_addr")));
                sb.append(FormatUtils.formatDollarTd(results.getObject("offer")));
                sb.append("</tr>\n");
            }
            sb.append("</table>");
            results.close();
            stmt.close();
            return sb.toString();
        } catch (Exception e) {
            return "Exception thrown in WebUserSql.listAllUsers(): " + e.getMessage()
                    + "<br/> partial output: <br/>" + sb.toString();
        }
    }
}