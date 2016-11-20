package hashiapp.pomodorotimer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * Created by yusuke on 2016/11/20.
 */
class TimerFragment : Fragment() {
    private var label: TextView? = null
    private var startButton: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view =  inflater.inflate(R.layout.timer, container, false)
        label = view.findViewById(R.id.timer) as TextView
        startButton = view.findViewById(R.id.start_button) as Button

        return view
    }
}