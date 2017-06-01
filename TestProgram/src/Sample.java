
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.CategoryDataset;
//import org.jfree.data.DefaultCategoryDataset;
import dori.jasper.engine.design.JasperDesign;
import dori.jasper.engine.JasperManager;
import dori.jasper.engine.JasperReport;
import dori.jasper.engine.JasperPrint;
import dori.jasper.engine.JasperPrintManager;
import dori.jasper.view.JasperViewer;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class Sample {
	/** Creates a new instance of Sample */
	public Sample() {
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		try
		{
			// First, load JasperDesign from XML and compile it into JasperReport
			JasperDesign jasperDesign = JasperManager.loadXmlDesign("G:\\Jar Files\\TestFiles\\sample.jrxml");
					JasperReport jasperReport = JasperManager.compileReport(jasperDesign);
					// Second, create a map of parameters to pass to the report.
					Map parameters = new HashMap();
					parameters.put("employeeChart", createEmployeeChartImage());
					// Third, get a database connection
					Connection conn = Database.getConnection();
					// Fourth, create JasperPrint using fillReport() method
					JasperPrint jasperPrint = JasperManager.fillReport(jasperReport, parameters, conn);
					// You can use JasperPrint to create PDF
					JasperManager.printReportToPdfFile(jasperPrint, "desired-path\\SampleReport.pdf");
					// Or to view report in the JasperViewer
					JasperViewer.viewReport(jasperPrint);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static java.awt.Image createEmployeeChartImage()
	{
		// employeeData contains employee names as keys and total work hours as values.
		java.util.Hashtable employeeData = getEmployeeData();
		// create a dataset...
		DefaultPieDataset data = new DefaultPieDataset();
		// fill dataset with employeeData
		for(java.util.Enumeration e = employeeData.keys(); e.hasMoreElements();)
		{
			String employeeName = (String)e.nextElement();
			data.setValue(employeeName, (Double)employeeData.get(employeeName));
		}
		// create a chart with the dataset
		JFreeChart chart = ChartFactory.createPieChart("Employee Chart", data, true, true, true);
		// create and return the image
		return chart.createBufferedImage(500, 220);
	}
}