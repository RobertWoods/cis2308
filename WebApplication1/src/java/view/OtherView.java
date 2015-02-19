package view;

// classes imported from java.sql.*
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// classes in my project
import dbUtils.DbConn;
import dbUtils.FormatUtils;
 
public class OtherView {

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
            String sql = "select listing_id, listing_addr, zipcode, description, asking_price, year_built, area_sqft, garage_012 from propertylisting order by listing_id";
            stmt = dbc.getConn().prepareStatement(sql);
            results = stmt.executeQuery();
            //sb.append("executed the query " + "<br/><br/>");
            sb.append("<table class='");
            sb.append(cssClassForResultSetTable);
            sb.append("'>");
            sb.append("<tr>");
            sb.append("<th style='text-align:left'>Id</th>");
            sb.append("<th style='text-align:center'>Address</th>");
            sb.append("<th style='text-align:center'>Zip</th>");
//            sb.append("<th style='text-align:center'>Description</th></tr>");
            sb.append("<th style='text-align:center'>Price</th>");
            sb.append("<th style='text-align:center'>Year</th>");
            sb.append("<th style='text-align:center'>Area</th></tr>");
//            sb.append("<th style='text-align:right'>Garage</th></tr>");
            while (results.next()) {
                sb.append("<tr>");
                sb.append(FormatUtils.formatDateTd(results.getObject("listing_id")));
                sb.append(FormatUtils.formatStringTd(results.getObject("listing_addr")));
                sb.append(FormatUtils.formatIntegerTd(results.getObject("zipcode")));
//                sb.append(FormatUtils.formatStringTd(results.getObject("description")));
                sb.append(FormatUtils.formatDollarTd(results.getObject("asking_price")));
                sb.append(FormatUtils.formatIntegerTd(results.getObject("year_built")));
                sb.append(FormatUtils.formatIntegerTd(results.getObject("area_sqft")));
//                sb.append(FormatUtils.formatIntegerTd(results.getObject("garage_012")));
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