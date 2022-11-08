package comgestionproductos.servicio;
import comgestionproductos.model.Producto;
import comgestionproductos.repositorio.IProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {
    @Autowired
    private IProductoRepositorio productoRepositorio;

    public List<Producto> listAll(String palabraClave){
        if(palabraClave != null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();

    }

    public void save(Producto producto){
        productoRepositorio.save(producto);
    }

    public Producto get(Long id){
        return productoRepositorio.findById(id).get();
    }

    public void delete(Long id){
        productoRepositorio.deleteById(id);
    }
}
