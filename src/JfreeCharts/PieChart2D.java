package JfreeCharts;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart2D  {

    public PieChart2D() {
        DefaultPieDataset piedata = new DefaultPieDataset(); 
        piedata.setValue(ChartModel.data[0], ChartModel.dataName[0]);
        piedata.setValue(ChartModel.data[1], ChartModel.dataName[1]);
        piedata.setValue(ChartModel.data[2], ChartModel.dataName[2]);
        
        JFreeChart chart = ChartFactory.createPieChart("PIE CHART", piedata, true, true, true);
        ChartFrame frame = new ChartFrame("PIE CHART", chart);
        frame.setVisible(true);
        frame.setSize(500, 500);

    }

}

