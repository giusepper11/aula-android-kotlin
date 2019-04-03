package br.com.fernandosousa.lmsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.util.zip.Inflater

class TelaInicialActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        var params = intent.extras

        val nome = params.getString("nome_usuario")
        val numero = params.getInt("numero")

        Toast.makeText(this, "$nome $numero", Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId

        if (id==R.id.action_buscar){
            Toast.makeText(this, "Clicou buscar", Toast.LENGTH_LONG).show()
        } else if (id==R.id.action_atualizar){
            Toast.makeText(this, "Clicou atualizar", Toast.LENGTH_LONG).show()
        } else if(id==R.id.action_config) {
            Toast.makeText(this, "Clicou configuracoes", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
