package JfreeCharts;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class PieChart  {

    public PieChart() {
        DefaultPieDataset piedata = new DefaultPieDataset(); 
        piedata.setValue(ChartModel.data[0], ChartModel.dataName[0]);
        piedata.setValue(ChartModel.data[1], ChartModel.dataName[1]);
        piedata.setValue(ChartModel.data[2], ChartModel.dataName[2]);
        
        JFreeChart chart = ChartFactory.createPieChart3D("Pie Chart 3D", piedata ,true, true, false);
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(120);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.4f);
		plot.setNoDataMessage("No data to display");
        ChartFrame frame = new ChartFrame("PIE CHART 3D", chart);
        frame.setVisible(true);
        frame.setSize(500, 500);

    }

}

