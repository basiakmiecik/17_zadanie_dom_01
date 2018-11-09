import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calcmeter")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException,NumberFormatException,NullPointerException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");
        String kilogramy = request.getParameter("kilogramy");
        String dekagramy = request.getParameter("dekagramy");
        String gramy = request.getParameter("gramy");
        try {

            if (("").equals(metry) && ("").equals(centymetry) ||
                    ("").equals(milimetry) && ("").equals(centymetry) ||
                    ("").equals(milimetry) && ("").equals(metry)) {

                double mm = 0;
                double cm = 0;
                double m = 0;

                if (!(metry.equals(""))) {
                    m = Double.valueOf(metry);
                    cm = m * 100;
                    mm = m * 1000;
                } else if (!(centymetry.equals(""))) {
                    cm = Double.valueOf(centymetry);
                    m = cm / 100;
                    mm = cm * 10;
                } else if (!(milimetry.equals(""))) {
                    mm = Double.valueOf(milimetry);
                    cm = mm / 10;
                    m = mm / 1000;
                }
                writer.println("<h2>"+"Miary po przeliczeniu"+"</h2>");
                writer.println("<h3>"+"Milimetry: " + mm+"<h3>");
                writer.println("<h3>"+"Centymetry: " + cm+"</h3>");
                writer.println("<h3>"+"Metry: " + m+"</h3>");

            } else if (kilogramy.equals("") && gramy.equals("") ||
                    kilogramy.equals("") && dekagramy.equals("") ||
                    dekagramy.equals("") && gramy.equals("")) {
                double kg = 0;
                double dg = 0;
                double g = 0;

                if (!(("").equals(kilogramy))) {
                    kg = Double.valueOf(kilogramy);
                    dg = kg * 100;
                    g = kg * 1000;
                } else if (!(("").equals(dekagramy))) {
                    dg = Double.valueOf(dekagramy);
                    kg = dg / 100;
                    g = dg * 10;
                } else if (!(("").equals(gramy))) {
                    g = Double.valueOf(gramy);
                    dg = g / 10;
                    kg = g / 1000;
                }

                writer.println("<h2>"+"Wagi po przeliczeniu"+"</h2>");
                writer.println("<h3>"+"Miligramy: " + g+"</h3>");
                writer.println("<h3>"+"Dekagramy: " + dg+"</h3>");
                writer.println("<h3>"+"Kilogramy: " + kg+"</h3>");
            } else {

                writer.println("<h3>"+"Wypełniono więcej niż jedno pole. " +"</h3>");
                writer.println("<h3>"+ "Proszę jeszcze raz wypełnić dane. " +"</h3>");
                writer.println("<h3>"+ "Wystarczy wypełnić tylko jedno pole!"+"</h3>");
            }
        } catch (NumberFormatException e) {
            writer.println("<h3>"+"Proszę wprowadź dane w postaci numerycznej"+"</h3>");
        } catch (NullPointerException e){
            writer.println("<h3>"+ "Wystarczy wypełnić tylko jedno pole!"+"</h3>");
        }
    }

}
