package therealfarfetchd.quacklib.common

/**
 * Created by marco on 09.07.17.
 */
enum class DataTarget {
  /**
   * The data will be saved to disk.
   */
  Save,

  /**
   * The data will be sent to the client.
   */
  Client;
}