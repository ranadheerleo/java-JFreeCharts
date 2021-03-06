package JfreeCharts;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart2D {

    public BarChart2D() {
 
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.setValue(ChartModel.dataName[0], "Student Count", ChartModel.data[0]);
        data.setValue(ChartModel.dataName[1], "Student Count", ChartModel.data[1]);
        data.setValue(ChartModel.dataName[2], "Student Count", ChartModel.data[2]);
        
        JFreeChart Chart = ChartFactory.createBarChart("BAR CHART", "Degree", "Enrolment", data);
        CategoryPlot p = Chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart", Chart);
        frame.setVisible(true);
        frame.setSize(450, 450);

    }
}
