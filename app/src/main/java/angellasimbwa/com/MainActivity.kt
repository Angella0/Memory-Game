package angellasimbwa.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import angellasimbwa.com.models.BoardSize

class MainActivity : AppCompatActivity() {

    private lateinit var rvboard: RecyclerView
    private lateinit var tvNumMove: TextView
    private lateinit var tvNumPairs: TextView

    private var boardsize: BoardSize = BoardSize.EASY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvboard = findViewById(R.id.rvboard)
        tvNumMove = findViewById(R.id.tvNumMoves)
        tvNumPairs = findViewById(R.id.tvNumPairs)



        rvboard.adapter = MemoryBoardAdapter(this, boardsize)
        rvboard.setHasFixedSize(true)
        rvboard.layoutManager = GridLayoutManager(this, boardsize.getWidth())

    }
}